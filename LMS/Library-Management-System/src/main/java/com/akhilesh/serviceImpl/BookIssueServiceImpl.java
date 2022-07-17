package com.akhilesh.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhilesh.entity.Book;
import com.akhilesh.entity.BookIssue;
import com.akhilesh.entity.User;
import com.akhilesh.repo.BookIssueRepository;
import com.akhilesh.repo.BookRepository;
import com.akhilesh.repo.UserRepository;
import com.akhilesh.service.BookIssueService;

@Service
public class BookIssueServiceImpl implements BookIssueService{
	
	@Autowired
	private BookIssueRepository bookIssueRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public BookIssue createBookIssue(long bookId, long userId, long libId,BookIssue bookIssue) {
		User user = userRepository.findById(userId).get();
		User librId = userRepository.findById(libId).get();
		Book book = bookRepository.findById(bookId).get();
		bookIssue.setBookId(book);
		bookIssue.setIssueTo(user);
		bookIssue.setCreatedBy(librId);
		return bookIssueRepository.save(bookIssue);
	}

	@Override
	public List<BookIssue> findAllBookIssue() {
		return bookIssueRepository.findAll();
	}

	@Override
	public List<BookIssue> getAllBookIssueByStatus(String status) {
		return bookIssueRepository.getBookIssueByStatus(status);
	}

	@Override
	public Optional<BookIssue> getBookIssueById(long transactionId) {
		return bookIssueRepository.findById(transactionId);
	}

	@Override
	public BookIssue saveBookIssue(BookIssue bookIssue) {
		return bookIssueRepository.save(bookIssue);
	}

	@Override
	public void deleteBookIssue(long transactionId) {
		bookIssueRepository.deleteById(transactionId);		
	}

	@Override
	public List<BookIssue> getAllBookIssue() {
		return bookIssueRepository.findAll();
	}

	@Override
	public BookIssue updateBookIssue(BookIssue bookIssue) {
		return bookIssueRepository.save(bookIssue);
	}


}
