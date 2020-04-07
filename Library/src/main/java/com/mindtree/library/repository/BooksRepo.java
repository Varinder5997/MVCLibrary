package com.mindtree.library.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindtree.library.entity.Books;
@Repository
public interface BooksRepo extends JpaRepository<Books, Integer> {
	public Books findByBookName(String book);
}
