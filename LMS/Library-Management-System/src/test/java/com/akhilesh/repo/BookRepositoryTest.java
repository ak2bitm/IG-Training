package com.akhilesh.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.akhilesh.entity.Book;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepository;

	private Book book;

	@BeforeEach
	public void setUpBook() {
		book = Book.builder().bookId(1L).bookName("DevOops").author("Gene Kim").noOfCopies(100).pages(800).price(650.00)
				.publication("Sri").status("Available").build();
	}

	@DisplayName("Junit test for save book")
	@Test
	public void givenBookObject_whenSave_thenReturnBookObject() {
		Book savedBook = bookRepository.save(book);
		assertThat(savedBook).isNotNull();
		assertThat(savedBook.getBookId()).isGreaterThan(0);
	}

	@DisplayName("Junit test for get all books")
	@Test
	public void givenBookList_whenFindAll_thenReturnBookList() {
		Book book1 = Book.builder().bookName("DevOops Advanced").author("Gene Kim").noOfCopies(100).pages(800)
				.price(650.00).publication("Sri").status("Available").build();
		bookRepository.save(book);
		bookRepository.save(book1);
		List<Book> bookList = bookRepository.findAll();
		assertThat(bookList).isNotNull();
		assertThat(bookList.size()).isGreaterThan(0);
	}

	@DisplayName("Junit test for get book by book id")
	@Test
	public void givenBookObject_whenFindById_thenReturnBookObject() {
		bookRepository.save(book);
		Book bookDtls = bookRepository.findById(book.getBookId()).get();
		assertThat(bookDtls).isNotNull();
	}

	@DisplayName("Junit test for update book")
	@Test
	public void givenBookObject_whenUpdate_thenReturnBookObject() {
		bookRepository.save(book);
		Book savedBook = bookRepository.findById(book.getBookId()).get();
		savedBook.setBookName("Advanced DevOops");
		savedBook.setNoOfCopies(80);
		Book updateBook = bookRepository.save(savedBook);
		assertThat(updateBook.getBookName()).isEqualTo("Advanced DevOops");
		assertThat(updateBook.getNoOfCopies()).isEqualTo(80);
	}

	@DisplayName("Junit test for delete book")
	@Test
	public void givenBookObject_whenDelete_thenReturnNothing() {
		bookRepository.save(book);
		bookRepository.deleteById(book.getBookId());
		Optional<Book> bookDetls = bookRepository.findById(book.getBookId());
		assertThat(bookDetls.isEmpty());
	}

}
