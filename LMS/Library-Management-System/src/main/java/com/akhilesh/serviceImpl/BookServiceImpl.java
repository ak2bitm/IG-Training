package com.akhilesh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhilesh.entity.Book;
import com.akhilesh.entity.User;
import com.akhilesh.repo.BookRepository;
import com.akhilesh.repo.UserRepository;
import com.akhilesh.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Book saveBook(Long libId,Book book) {
		User user = userRepository.findById(libId).get();
		book.setCreatedBy(user);
		return bookRepository.save(book);
	}

}
