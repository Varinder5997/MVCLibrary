package com.mindtree.library.service;

import java.util.List;

import com.mindtree.library.entity.Books;
import com.mindtree.library.entity.Library;

public interface LibraryService {
	int addLibrary(Library library);

	List<Library> allLibrary();

	List<Books> books(int id);

	Library update(int id);

	List<Integer> allId();

	String deleteLibrary(int id);

	String saveLibrary(Library library);
}
