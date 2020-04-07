package com.mindtree.librarymanagement.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int libraryId;
	private String libraryName;
	@ManyToMany(mappedBy = "allLibraies")
	List<Books> allBooks;
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public List<Books> getAllBooks() {
		return allBooks;
	}
	public void setAllBooks(List<Books> allBooks) {
		this.allBooks = allBooks;
	}
	

}
