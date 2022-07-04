package com.akhilesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.entity.BookIssue;
import com.akhilesh.service.BookIssueService;

@RestController
@RequestMapping("/api/library")
public class BookIssueController {

	@Autowired
	private BookIssueService bookIssueService;
	
	@PostMapping("/bookissue/{bookId}/{userId}/{libId}")
	public BookIssue createBookIssue(@RequestBody BookIssue bookIssue,
				@PathVariable("userId")Long userId, @PathVariable("bookId")Long bookId, @PathVariable("libId")Long libId) {
		return bookIssueService.createBookIssue(bookId,userId, libId, bookIssue);
	}
	
	@GetMapping("/bookissue")
	public List<BookIssue> findAllBookIssue(){
		return bookIssueService.findAllBookIssue();
	}
	
	@GetMapping("/bookissue?status=Request")
	public List<BookIssue> findBookIssueByStatus(@RequestParam String status) {
		return bookIssueService.findBookbyStatus(status);
	}
	
	
	
}
