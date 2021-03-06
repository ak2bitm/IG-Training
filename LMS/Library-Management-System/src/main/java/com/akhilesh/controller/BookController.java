package com.akhilesh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.entity.Book;
import com.akhilesh.service.BookService;

@RestController
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping("/books/{libId}")
	public Book saveBook(@PathVariable("libId") Long libId, @RequestBody Book book) {
		return bookService.saveBook(libId, book);
	}

	@PostMapping("/books")
	@ResponseStatus(HttpStatus.CREATED)
	public Book createBook(@RequestBody Book book) {
		return bookService.saveBookInfo(book);
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/{bookId}")
	public Optional<Book> getBookByBookId(@PathVariable Long bookId) {
		return bookService.getBookByBookId(bookId);
	}

	@GetMapping("/books/search")
	public List<Book> getBookbyBookName(@RequestParam String bookName) {
		return bookService.getBookbyBookName(bookName);
	}

	@GetMapping("/books/auth")
	public List<Book> getBookByAuthor(@RequestParam String authName) {
		return bookService.getBookByAuthor(authName);
	}

	@GetMapping("/books/get")
	public List<Book> getBookByAuthorAndBookName(@RequestParam String authName, @RequestParam String bookName) {
		return bookService.getBookByAuthorAndBookName(authName, bookName);
	}

	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable Long bookId) {
		bookService.deleteBook(bookId);
	}
	
	@PutMapping("/books/{bookId}")
	public ResponseEntity<Book> updateBook(@PathVariable long bookId, @RequestBody Book updateBook) {
		
		return bookService.getBookByBookId(bookId).map(savedBook->{
			savedBook.setAuthor(updateBook.getAuthor());
			savedBook.setBookName(updateBook.getBookName());
			savedBook.setCreatedOn(updateBook.getCreatedOn());
			savedBook.setModifiedBy(updateBook.getModifiedBy());
			savedBook.setModifiedOn(updateBook.getModifiedOn());
			savedBook.setNoOfCopies(updateBook.getNoOfCopies());
			savedBook.setPages(updateBook.getPages());
			savedBook.setPrice(updateBook.getPrice());
			savedBook.setPublication(updateBook.getPublication());
			Book updatedBookInfo = bookService.saveBookInfo(updateBook);
			return new ResponseEntity<>(updatedBookInfo, HttpStatus.OK);
		}).orElseGet(()->ResponseEntity.notFound().build());
	}
}
