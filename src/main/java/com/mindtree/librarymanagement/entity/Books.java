package com.mindtree.librarymanagement.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	@ManyToMany(mappedBy = "allBooks")
	List<Library> allLibraies;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<Library> getAllLibraies() {
		return allLibraies;
	}
	public void setAllLibraies(List<Library> allLibraies) {
		this.allLibraies = allLibraies;
	}
	

}
