package com.akhilesh.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.akhilesh.entity.Book;
import com.akhilesh.repo.BookRepository;
import com.akhilesh.serviceImpl.BookServiceImpl;


@ExtendWith(SpringExtension.class)
public class BookServiceTest {


	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private BookServiceImpl bookService;

	@DisplayName("Junit test for save book")
	@Test
	public void givenBookObject_whenSaveBook_thenReturnBookObject() {
		
		Book book = Book.builder().bookId(61L).bookName("DevOops").author("Gene Kim").noOfCopies(100).pages(800).price(650.00)
				.publication("Sri").status("Available").build();
		BDDMockito.given(bookRepository.findById(book.getBookId())).willReturn(Optional.empty());
		BDDMockito.given(bookRepository.save(book)).willReturn(book);

     		Book savedBook = bookService.saveBookInfo(book);
     		assertThat(savedBook).isNotNull();
	}
	
	
	@DisplayName("Junit test for get all books")
	@Test
	public void givenBookObject_whenFindAll_thenReturnBookObjcet() {
		Book book = Book.builder().bookId(61L).bookName("DevOops").author("Gene Kim").noOfCopies(100).pages(800).price(650.00)
				.publication("Sri").status("Available").build();
		BDDMockito.given(bookRepository.findAll()).willReturn(List.of(book));
		List<Book> bookList = bookService.getAllBooks();
		assertThat(bookList).isNotNull();
		assertThat(bookList.size()).isGreaterThan(0);
	}
	
	@DisplayName("Junit test for update book")
	@Test
	public void givenBookObject_WhenUpdateBook_thenReturnBookObject() {
		Book book = Book.builder().bookId(61L).bookName("DevOops").author("Gene Kim").noOfCopies(100).pages(800).price(650.00)
				.publication("Sri").status("Available").build();
		BDDMockito.given(bookRepository.findById(book.getBookId())).willReturn(Optional.of(book));
		book.setPrice(400.00);
		BDDMockito.given(bookRepository.save(book)).willReturn(book);
		Book updateBook = bookService.updateBook(book);
		assertThat(updateBook.getPrice()).isEqualTo(400.00);
	}
	
	@DisplayName("Junit test for get book by book id")
	@Test
	public void givenBookObject_whenFindById_thenReturnBookObject() {
		Book book = Book.builder().bookId(61L).bookName("DevOops").author("Gene Kim").noOfCopies(100).pages(800).price(650.00)
				.publication("Sri").status("Available").build();
		BDDMockito.given(bookRepository.findById(book.getBookId())).willReturn(Optional.of(book));
		Book savedBook = bookService.getBookByBookId(book.getBookId());
		assertThat(savedBook).isNotNull();
	}
	
	@DisplayName("Junit test for delete book")
	@Test
	public void givenBookObject_whenDeleteById_thenReturnNothing() {
		Book book = Book.builder().bookId(61L).bookName("DevOops").author("Gene Kim").noOfCopies(100).pages(800).price(650.00)
				.publication("Sri").status("Available").build();
		BDDMockito.willDoNothing().given(bookRepository).deleteById(book.getBookId());
		bookService.deleteBook(book.getBookId());
		verify(bookRepository, times(1)).deleteById(book.getBookId());
		
	}
	

}
