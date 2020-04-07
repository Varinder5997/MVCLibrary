package com.mindtree.library.dto;

import java.util.List;

import com.mindtree.library.entity.Books;
import com.mindtree.library.entity.Library;

public class ModelDto {

	private List<Books> books;
	private Library library;

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

}
