package com.akhilesh.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.akhilesh.entity.Book;
import com.akhilesh.entity.User;
import com.akhilesh.repo.BookRepository;
import com.akhilesh.repo.UserRepository;
import com.akhilesh.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	private UserRepository userRepository;

	public BookServiceImpl(BookRepository bookRepository, UserRepository userRepository) {
		super();
		this.bookRepository = bookRepository;
		this.userRepository = userRepository;
	}

	@Override
	public Book saveBook(Long libId, Book book) {
		User user = userRepository.findById(libId).get();
		book.setCreatedBy(user);
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBookByBookId(Long bookId) {
		return bookRepository.findById(bookId);
	}

	@Override
	public List<Book> getBookbyBookName(String bookName) {
		return bookRepository.findByBookName(bookName);
	}

	@Override
	public List<Book> getBookByAuthor(String authName) {
		return bookRepository.findByAuthor(authName);
	}

	@Override
	public List<Book> getBookByAuthorAndBookName(String authName, String bookName) {
		return bookRepository.findByAuthorAndBookName(authName, bookName);
	}

	@Override
	public Book saveBookInfo(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Long bookId) {
		bookRepository.deleteById(bookId);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
}
