package com.akhilesh.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.entity.Book;
import com.akhilesh.service.BookService;

import io.swagger.annotations.ApiOperation;

@RestController
public class BookController {

	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@ApiOperation(value = "saveBook", response = Book.class, notes = "given book info by LIB id")
	@PostMapping("/books/{libId}")
	public Book saveBook(@PathVariable("libId")Long libId, @RequestBody Book book) {
		return bookService.saveBook(libId,book);
	}
	
	@ApiOperation(value = "createBook", response = Book.class, notes = "given book info")
	@PostMapping("/books")
	@ResponseStatus(HttpStatus.CREATED)
	public Book createBook(@RequestBody Book book) {
		return bookService.saveBookInfo(book);
	}
	@ApiOperation(value = "getAllBooks", response = Book.class, notes = "get all book List")
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	@ApiOperation(value = "getBookByBookId", response = Book.class, notes = "given book info by book id")
	@GetMapping("/books/{bookId}")
	public Book getBookByBookId(@PathVariable Long bookId) {
		return bookService.getBookByBookId(bookId);
	}
	@ApiOperation(value = "getBookbyBookName", response = List.class, notes = "given book info by book name")
	@GetMapping("/books/search")
	public List<Book> getBookbyBookName(@RequestParam String bookName){
		return bookService.getBookbyBookName(bookName);
	}
	@ApiOperation(value = "getBookByAuthor", response = List.class, notes = "given book info by author name")
	@GetMapping("/books/auth")
	public List<Book> getBookByAuthor(@RequestParam String authName){
		return bookService.getBookByAuthor(authName);
	}
	@ApiOperation(value = "getBookByAuthorAndBookName", response = List.class, notes = "given book info by author name and book name")
	@GetMapping("/books/get")
	public List<Book> getBookByAuthorAndBookName(@RequestParam String authName, @RequestParam String bookName){
		return bookService.getBookByAuthorAndBookName(authName, bookName);
	}
	@ApiOperation(value = "deleteBook", notes = "given book info by book id")
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable Long bookId) {
		bookService.deleteBook(bookId);
	}
}
