package com.akhilesh.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.akhilesh.entity.BookIssue;
import com.akhilesh.service.BookIssueService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(value = BookIssueController.class)
public class BookIssueControllerTest {

	@MockBean
	private BookIssueService bookIssueService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	private BookIssue bookIssue;
	
	@BeforeEach
	public void setupBookIssue() {
		bookIssue = BookIssue.builder().bokkIssueDate(new Date()).status("Approved").remarks("Book Issued").build();
	}
	
	
	@DisplayName("junit test for save Book issue rest api")
	@Test
	public void givenBookissue_whenSaveBookIssue_thenReturnBookIssue() throws JsonProcessingException, Exception {
		BDDMockito.given(bookIssueService.saveBookIssue(any(BookIssue.class))).willAnswer(invocation->invocation.getArgument(0));
		ResultActions response = mockMvc.perform(post("/bookissue").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(bookIssue)));
		response
		.andDo(print())
		.andExpect(status().isCreated());
	}
	
	@DisplayName("Junit test for get all book issue rest api")
	@Test
	public void givenBookIssueList_whenGetAllBookIssue_thenReturnAllBookIssuelist() throws Exception {
		List<BookIssue> bookIssueList = new ArrayList<>();
		bookIssueList.add(bookIssue = BookIssue.builder().bokkIssueDate(new Date()).status("Approved").remarks("Book Issued").build());
		bookIssueList.add(bookIssue = BookIssue.builder().bokkIssueDate(new Date()).status("Approved").remarks("Book Issued").build());
		BDDMockito.given(bookIssueService.getAllBookIssue()).willReturn(bookIssueList);
		ResultActions response = mockMvc.perform(get("/bookissuelist"));
		response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.size()", is(bookIssueList.size())));		
	}
	
	@DisplayName("Junit test for get book issue by transaction id rest api")
	@Test
	public void givenBookIssue_whenFindBookIssueByTransactionId_thenReturnBookIssue() throws Exception {
		BDDMockito.given(bookIssueService.getBookIssueById(bookIssue.getTransactionId())).willReturn(Optional.of(bookIssue));
		ResultActions response = mockMvc.perform(get("/bookissue/{transactionId}", bookIssue.getTransactionId()));
		response.andExpect(status().isOk())
		.andDo(print());
	}
	
	@DisplayName("Junit test for update book issue transaction rest api")
	@Test
	public void givenBookIssueObject_whenUpdaeBookIssue_thenReturnBookIssueObject() throws JsonProcessingException, Exception {
		long transactionId = 4L;
		BookIssue savedBookIssue = BookIssue.builder().status("Pending").build();
		BookIssue updateBookIssue = BookIssue.builder().bokkIssueDate(new Date()).status("Approved").remarks("Book Issued").build();
		
		BDDMockito.given(bookIssueService.getBookIssueById(savedBookIssue.getTransactionId())).willReturn(Optional.of(savedBookIssue));
		BDDMockito.given(bookIssueService.updateBookIssue(any(BookIssue.class))).willAnswer(inv->inv.getArgument(0));
		ResultActions response = mockMvc.perform(put("/bookissue/{transactionId}", transactionId).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateBookIssue)));
		response.andDo(print());
	}
	@DisplayName("Junit test for delete book issue rest api")
	@Test
	public void givenBookIssue_whenDeleteByBookIssueTransactionId_thenReturnNothing() throws Exception {
		BDDMockito.willDoNothing().given(bookIssueService).deleteBookIssue(bookIssue.getTransactionId());
		bookIssueService.deleteBookIssue(bookIssue.getTransactionId());
		ResultActions response = mockMvc.perform(delete("/bookissue/{transactionId}", bookIssue.getTransactionId()));
		response.andExpect(status().isOk()).andDo(print());
	}
}
