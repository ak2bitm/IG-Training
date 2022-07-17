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

import com.akhilesh.entity.BookIssue;
import com.akhilesh.service.BookIssueService;

@RestController
public class BookIssueController {

	private BookIssueService bookIssueService;
	
	
	public BookIssueController(BookIssueService bookIssueService) {
		super();
		this.bookIssueService = bookIssueService;
	}

	@PostMapping("/bookissue/{bookId}/{userId}/{libId}")
	public BookIssue createBookIssue(@RequestBody BookIssue bookIssue,
				@PathVariable("userId")Long userId, @PathVariable("bookId")Long bookId, @PathVariable("libId")Long libId) {
		return bookIssueService.createBookIssue(bookId,userId, libId, bookIssue);
	}
	
	@PostMapping("/bookissue")
	@ResponseStatus(HttpStatus.CREATED)
	public BookIssue saveBookIssue(@RequestBody BookIssue bookIssue) {
		return bookIssueService.saveBookIssue(bookIssue);
	}
	@GetMapping("/bookissue")
	public List<BookIssue> findAllBookIssue(){
		return bookIssueService.findAllBookIssue();
	}
	@GetMapping("/bookissuelist")
	public List<BookIssue>getAllBookIssue(){
		return bookIssueService.getAllBookIssue();
	}
	@GetMapping("/bookissue/query")
	public List<BookIssue> getAllBookIssueByStatus(@RequestParam String status){
		return bookIssueService.getAllBookIssueByStatus(status);
	}
	
	@DeleteMapping("/bookissue/{transactionId}")
	public void deleteBookIssue(@PathVariable long transactionId) {
		bookIssueService.deleteBookIssue(transactionId);
	}
	
	@GetMapping("/bookissue/{transactionId}")
	public Optional<BookIssue> getBookIssueById(@PathVariable long transactionId){
		return bookIssueService.getBookIssueById(transactionId);
	}
	
	@PutMapping("/bookissue/{transactionId}")
	public ResponseEntity<BookIssue> updateBookIssue(@PathVariable long transactionId, @RequestBody BookIssue bookIssue){
		return bookIssueService.getBookIssueById(transactionId).map(book->{
			book.setRemarks(bookIssue.getRemarks());
			book.setStatus(bookIssue.getStatus());
			BookIssue updateBookIssue = bookIssueService.updateBookIssue(book);
			return new ResponseEntity<>(updateBookIssue, HttpStatus.OK);
		}).orElseGet(()-> ResponseEntity.notFound().build());
	}
}
