package com.mindtree.library.service;

import java.util.List;

import com.mindtree.library.entity.Books;

public interface BookService {
	Books addBook(Books book, int libraryId);

	List<Books> allBooks();

	List<Integer> allId(int uid);

	String deleteBook(int id);

	Books find(int id);

	String update(Books book);

	String savebook(Books Book);
}
