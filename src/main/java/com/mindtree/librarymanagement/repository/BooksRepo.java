package com.mindtree.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.librarymanagement.entity.Books;

public interface BooksRepo extends JpaRepository<Books, Integer> {

}
