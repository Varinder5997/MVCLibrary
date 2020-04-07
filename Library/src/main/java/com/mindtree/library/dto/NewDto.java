package com.mindtree.library.dto;

import java.util.List;

import com.mindtree.library.entity.Library;

public class NewDto {
	
	Library library;
	List<Library> allLibraries;
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public List<Library> getAllLibraries() {
		return allLibraries;
	}
	public void setAllLibraries(List<Library> allLibraries) {
		this.allLibraries = allLibraries;
	}
	

}
