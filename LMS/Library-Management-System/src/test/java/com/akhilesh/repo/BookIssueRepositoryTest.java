package com.akhilesh.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.akhilesh.entity.BookIssue;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookIssueRepositoryTest {

	@Autowired
	private BookIssueRepository bookIssueRepository;

	private BookIssue bookIssue;

	@BeforeEach
	public void setupBookIssue() {
		bookIssue = BookIssue.builder().bokkIssueDate(new Date()).status("Approved").remarks("Book Issued").build();
	}

	@DisplayName("Junit test for issue book rest api")
	@Test
	public void givenBookIssue_whenSave_thenReturnBookIssue() {
		BookIssue savedBookIssue = bookIssueRepository.save(bookIssue);
		assertThat(savedBookIssue).isNotNull();
		assertThat(savedBookIssue.getTransactionId()).isGreaterThan(0);
	}

	@DisplayName("Junit test for get all book issued rest api")
	@Test
	public void givenBookIssueList_whenFindAll_thenReturnBookIssueList() {
		BookIssue bookIssue1 = BookIssue.builder().bokkIssueDate(new Date()).status("Approved").remarks("Book Issued")
				.build();
		bookIssueRepository.save(bookIssue);
		bookIssueRepository.save(bookIssue1);
		List<BookIssue> bookIssueList = bookIssueRepository.findAll();
		assertThat(bookIssueList).isNotNull();
		assertThat(bookIssueList.size()).isEqualTo(9);
	}

	@DisplayName("Junit test for get book issue by transaction id")
	@Test
	public void givenBookIssue_whenFindById_thenReturnBookIssue() {
		bookIssueRepository.save(bookIssue);
		BookIssue savedBookIssue = bookIssueRepository.findById(bookIssue.getTransactionId()).get();
		assertThat(savedBookIssue).isNotNull();
	}

	@DisplayName("Junit test for delete book issue")
	@Test
	public void givenBookIssue_whenDeleteById_thenReturnBookIssue() {
		bookIssueRepository.save(bookIssue);
		bookIssueRepository.deleteById(bookIssue.getTransactionId());
		Optional<BookIssue> savedBookIssue = bookIssueRepository.findById(bookIssue.getTransactionId());
		assertThat(savedBookIssue).isEmpty();
	}
}
