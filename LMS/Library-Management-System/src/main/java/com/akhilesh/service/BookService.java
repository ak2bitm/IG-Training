package com.akhilesh.service;

import java.util.List;

import com.akhilesh.entity.Book;

public interface BookService {

	public Book saveBook(Long libId,Book book);
	
	public List<Book> getAllBooks();
	public Book getBookByBookId(Long bookId);
	public List<Book> getBookbyBookName(String bookName);
	public List<Book> getBookByAuthor(String authName);
	public List<Book> getBookByAuthorAndBookName(String authName, String bookName);
}
