package com.akhilesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.entity.Book;
import com.akhilesh.service.BookService;

@RestController
@RequestMapping("/api/library")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/books/{libId}")
	public Book saveBook(@PathVariable("libId")Long libId, @RequestBody Book book) {
		return bookService.saveBook(libId,book);
	}
}
