package com.akhilesh.booksearch.service;

import java.util.List;

import com.akhilesh.booksearch.dto.BookInfo;
import com.akhilesh.booksearch.entity.Book;
import com.akhilesh.booksearch.entity.BookInventory;
import com.akhilesh.booksearch.entity.BookRating;

public interface BookService {

	public List<Book> getBooks(String author, String category);
	public BookInfo getBookInfo(long bookId);
	public void updateBookRating(BookRating bookRating);
	public void updateBookInventory(BookInventory bookInventory);
}
