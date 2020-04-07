package com.mindtree.library.entity;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Library implements Comparable<Library> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int libraryId;
	private String libraryName;
	@JsonIgnoreProperties("allLibrary")
	@ManyToMany(mappedBy = "allLibrary",cascade = CascadeType.ALL)
	Set<Books> allBooks = new TreeSet<Books>();

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

	public Set<Books> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(Set<Books> allBooks) {
		this.allBooks = allBooks;
	}

	@Override
	public int compareTo(Library l) {
		// TODO Auto-generated method stub
		return this.libraryId - l.libraryId;
	}

}
