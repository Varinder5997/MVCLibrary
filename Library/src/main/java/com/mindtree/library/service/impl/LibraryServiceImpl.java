package com.mindtree.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.library.entity.Books;
import com.mindtree.library.entity.Library;
import com.mindtree.library.repository.LibraryRepo;
import com.mindtree.library.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	LibraryRepo libraryRepo;

	@Override
	public int addLibrary(Library library) {
		List<Library> allLibrary = this.libraryRepo.findAll();
		int count = 0;
		for (Library library2 : allLibrary) {
			if (library2.getLibraryName().compareToIgnoreCase(library.getLibraryName()) == 0) {
				count++;
			}
		}
		int count1 = 0;
		String sample = library.getLibraryName();
		char[] chars = sample.toCharArray();
		for (char c : chars) {
			if (Character.isDigit(c)) {
				count1++;
			}
		}
		if (count == 0 && count1 == 0) {
			this.libraryRepo.save(library);
			return 1;
		} else if (count > 0) {
			return 2;
			
		} else {
			return 3;
		}
	
	}

	@Override
	public List<Library> allLibrary() {
		return this.libraryRepo.findAll();
	}

	@Override
	public List<Books> books(int id) {
		Library library = this.libraryRepo.findById(id).get();
		List<Books> allBooks = new ArrayList<Books>(library.getAllBooks());
		return allBooks;
	}

	@Override
	public Library update(int id) {
		Library library = libraryRepo.findById(id).get();
		return library;
	}

	@Override
	public List<Integer> allId() {
		List<Library> allLibrary = this.libraryRepo.findAll();
		List<Integer> allIndex = new ArrayList<Integer>();
		for (Library library : allLibrary) {
			allIndex.add(library.getLibraryId());
		}
		return allIndex;
	}

	@Override
	public String deleteLibrary(int id) {
		this.libraryRepo.deleteById(id);
		return "deleted";
	}

	@Override
	public String saveLibrary(Library library) {
		this.libraryRepo.save(library);
		return null;
	}

}
