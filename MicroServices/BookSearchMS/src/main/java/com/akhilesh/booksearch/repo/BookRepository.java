package com.akhilesh.booksearch.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.booksearch.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	public List<Book> getBooksByAuthorAndCategory(String author, String category);
	public List<Book> getBooksByAuthor(String author);
	public List<Book> getBooksByCategory(String category);
}
