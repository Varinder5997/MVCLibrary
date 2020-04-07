package com.mindtree.library.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.library.entity.Books;
import com.mindtree.library.entity.Library;
import com.mindtree.library.repository.BooksRepo;
import com.mindtree.library.repository.LibraryRepo;
import com.mindtree.library.service.BookService;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BooksRepo bookRepo;
	@Autowired
	LibraryRepo libraryRepo;
	
	@Override
	public Books addBook(Books book,int libraryId) {
		Library library=this.libraryRepo.findById(libraryId).get();
		Books b=bookRepo.findByBookName(book.getBookName());
		library.getAllBooks().add(b);
		book.getAllLibrary().add(library);
		this.libraryRepo.save(library);
		return this.bookRepo.save(book);
	}

	@Override
	public List<Books> allBooks() {
		
		return this.bookRepo.findAll();
	}

	@Override
	public List<Integer> allId(int uid) {
		Library library=this.libraryRepo.findById(uid).get();
		Set<Books>allBook=library.getAllBooks();
		//List<Books> allBooks=this.bookRepo.findAll();
		List<Integer> allId=new ArrayList<>();
		for (Books books : allBook) {
			allId.add(books.getBookId());
		}
		return allId;
	}

	@Override
	public String deleteBook(int id) {
		this.bookRepo.deleteById(id);
		return null;
	}

	@Override
	public Books find(int id) {
		Books book=this.bookRepo.findById(id).get();
		return book;
	}

	@Override
	public String update(Books book) {
		this.bookRepo.save(book);
		return null;
	}

	@Override
	public String savebook(Books Book) {
		this.bookRepo.save(Book);
		return null;
	}
	
	
	
	

}
