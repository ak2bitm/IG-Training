package com.akhilesh.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.akhilesh.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

		public List<Book> findByBookName(String bookName);
		public List<Book> findByAuthor(String authName);
		@Query("select b from Book b where b.author=:a and b.bookName=:bn")
		public List<Book> findByAuthorAndBookName(@Param("a") String authName, @Param("bn") String bookName);
}
