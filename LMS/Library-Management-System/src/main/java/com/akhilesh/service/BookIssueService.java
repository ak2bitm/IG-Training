package com.akhilesh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akhilesh.entity.BookIssue;

@Service
public interface BookIssueService {

	public BookIssue createBookIssue(long bookId, long userId, long libId, BookIssue bookIssue);
	public List<BookIssue> findAllBookIssue();

}
