package com.mindtree.library.entity;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Books implements Comparable<Books> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	@JsonIgnoreProperties("allBooks")
	@ManyToMany
	Set<Library> allLibrary = new TreeSet<Library>();

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

	public Set<Library> getAllLibrary() {
		return allLibrary;
	}

	public void setAllLibrary(Set<Library> allLibrary) {
		this.allLibrary = allLibrary;
	}

	@Override
	public int compareTo(Books b) {

		return b.bookId - this.bookId;
	}

}
