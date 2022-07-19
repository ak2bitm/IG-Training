package com.akhilesh.booksearch.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akhilesh.booksearch.dto.BookInfo;
import com.akhilesh.booksearch.dto.BookPriceInfo;
import com.akhilesh.booksearch.entity.Book;
import com.akhilesh.booksearch.entity.BookInventory;
import com.akhilesh.booksearch.entity.BookRating;
import com.akhilesh.booksearch.repo.BookInventoryRepository;
import com.akhilesh.booksearch.repo.BookRatingRepository;
import com.akhilesh.booksearch.repo.BookRepository;
import com.akhilesh.booksearch.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	
	static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookRatingRepository bookRatingRepository;
	
	@Autowired
	private BookInventoryRepository bookInventoryRepository;

	@Override
	public List<Book> getBooks(String author, String category) {
		List<Book> mybooks = new ArrayList<>();
		if(author.equalsIgnoreCase("All Author") && category.equalsIgnoreCase("All Category")) {
			mybooks = bookRepository.findAll();
		}else if(author.equalsIgnoreCase("All Author") && !category.equalsIgnoreCase("All Category")) {
			mybooks = bookRepository.getBooksByCategory(category);
		}else if(!author.equalsIgnoreCase("All Author") && category.equalsIgnoreCase("All Category")) {
			mybooks = bookRepository.getBooksByAuthor(author);
		}else {
			mybooks = bookRepository.getBooksByAuthorAndCategory(author, category);
		}
		return mybooks;
	}

	@Override
	public BookInfo getBookInfo(long bookId) {
		BookInfo bookInfo = new BookInfo();
		//Book Details
		Book book = bookRepository.findById(bookId).get();
		bookInfo.setBookId(book.getBookId());
		bookInfo.setBookName(book.getBookName());
		bookInfo.setAuthor(book.getAuthor());
		bookInfo.setPublications(book.getPublications());
		bookInfo.setCategory(book.getCategory());
		
		//Book Rating Details
		BookRating bookRating = new BookRating();
		bookInfo.setAvgRating(bookRating.getAvgRating());
		bookInfo.setNoOfSearches(bookRating.getNoOfSearches());
		
		//Book Inventory Details
		BookInventory bookInventory = new BookInventory();
		bookInfo.setBooksAvailable(bookInventory.getBooksAvailable());
		
		//Book Price Details
		RestTemplate bookPriceRest = new RestTemplate();
		String endpoint = "http://localhost:9000/bookprice/"+bookId;
		BookPriceInfo bookPriceInfo = bookPriceRest.getForObject(endpoint, BookPriceInfo.class);
		bookInfo.setPrice(bookPriceInfo.getPrice());
		bookInfo.setOffer(bookPriceInfo.getOffer());
		return bookInfo;
	}

	@Override
	public void updateBookRating(BookRating bookRating) {
		bookRatingRepository.save(bookRating);		
	}

	@Override
	public void updateBookInventory(BookInventory bookInventory) {
		bookInventoryRepository.save(bookInventory);		
	}

}
