package com.mindtree.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.librarymanagement.entity.Library;

public interface LibraryRepo extends JpaRepository<Library, Integer> {

}
