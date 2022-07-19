package com.akhilesh.booksearch.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.booksearch.dto.BookInfo;
import com.akhilesh.booksearch.entity.Book;
import com.akhilesh.booksearch.entity.BookInventory;
import com.akhilesh.booksearch.entity.BookRating;
import com.akhilesh.booksearch.service.BookService;

@RestController
public class BookController {

	static Logger log = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;
	
	@GetMapping("/mybooks/{author}/{category}")
	public List<Book> getBooks(@PathVariable String author, @PathVariable String category){
		log.info("BookController-getBooks()");
		return bookService.getBooks(author, category);
	}
	
	@GetMapping("mybook/{bookId}")
	public BookInfo getBookById(@PathVariable long bookId) {
		log.info("BookController-getBookById()");
		return bookService.getBookInfo(bookId);
	}
	
	@PutMapping("/updatebookrating")
	public void updateBookRating(@RequestBody BookRating bookRating) {
		log.info("BookController-updateBookRating()");
		bookService.updateBookRating(bookRating);
	}
	
	@PutMapping("/updatebookinventory")
	public void updateBookInventory(@RequestBody BookInventory bookInventory) {
		log.info("BookController-updateBookRating()");
		bookService.updateBookInventory(bookInventory);
	}
	
	
	
}
