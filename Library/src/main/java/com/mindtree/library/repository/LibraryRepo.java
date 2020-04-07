package com.mindtree.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.library.entity.Library;
@Repository
public interface LibraryRepo extends JpaRepository<Library, Integer> {

}
