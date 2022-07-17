package com.akhilesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.akhilesh.entity.BookIssue;

@Service
public interface BookIssueService {

	public BookIssue createBookIssue(long bookId, long userId, long libId, BookIssue bookIssue);
	public List<BookIssue> findAllBookIssue();
	public List<BookIssue> getAllBookIssueByStatus(String status);
	public Optional<BookIssue> getBookIssueById(long transactionId);
	public BookIssue saveBookIssue(BookIssue bookIssue);
	public void deleteBookIssue(long transactionId);
	public List<BookIssue>getAllBookIssue();
	public BookIssue updateBookIssue(BookIssue bookIssue);

}
