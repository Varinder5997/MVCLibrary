package com.mindtree.library.dto;

import java.util.List;

public class LibraryDto {
	private int id;
	private List<Integer> allLibrary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Integer> getAllLibrary() {
		return allLibrary;
	}

	public void setAllLibrary(List<Integer> allLibrary) {
		this.allLibrary = allLibrary;
	}

}
