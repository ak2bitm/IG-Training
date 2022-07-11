package com.akhilesh.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
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

import com.akhilesh.entity.User;
import com.akhilesh.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(value = UserController.class)
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@Autowired
	private ObjectMapper objectMapper;
	private User user;

	@BeforeEach
	public void setUpUser() {
		user = User.builder().userName("Ramesh").age(25).email("ramesh@gmail.com").gender("Male").mobileNo(9999999999L)
				.address("Mumbai").userType("STU").status("Active").build();
	}

	@DisplayName("Junit test for creating rest api")
	@Test
	public void givenUserObject_whenCreateUser_thenReturnSaveUser() throws JsonProcessingException, Exception {

		BDDMockito.given(userService.createUser(any(User.class))).willAnswer(invocation -> invocation.getArgument(0));
		ResultActions response = mockMvc.perform(
				post("/users").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(user)));
		response.andDo(print()).andExpect(status().isCreated())
				.andExpect(jsonPath("$.userName", is(user.getUserName())))
				.andExpect(jsonPath("$.age", is(user.getAge()))).andExpect(jsonPath("$.gender", is(user.getGender())))
				.andExpect(jsonPath("$.email", is(user.getEmail())))
				.andExpect(jsonPath("$.mobileNo", is(user.getMobileNo())))
				.andExpect(jsonPath("$.address", is(user.getAddress())))
				.andExpect(jsonPath("$.userType", is(user.getUserType())))
				.andExpect(jsonPath("$.status", is(user.getStatus())));

	}

	@DisplayName("Junit test for get all user rest api")
	@Test
	public void givenUserObjectList_whengetAllUser_thenReturnUserList() throws Exception {
		List<User> userList = new ArrayList<>();
		userList.add(User.builder().userName("Sanjay").age(35).email("sanjay@gmail.com").gender("Male")
				.mobileNo(8888889999L).address("Varanasi").userType("STU").status("Active").build());
		userList.add(User.builder().userName("Suresh").age(35).email("suresh@gmail.com").gender("Male")
				.mobileNo(7777779999L).address("Varanasi").userType("STU").status("Active").build());
		BDDMockito.given(userService.getAllUsers()).willReturn(userList);
		ResultActions response = mockMvc.perform(get("/users"));
		response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.size()", is(userList.size())));
	}

	@DisplayName("Junit test for get user by id rest api")
	@Test
	public void givenUserObject_whenGetbyId_thenReturnUserObject() throws Exception {
		BDDMockito.given(userService.getUserById(user.getUserId())).willReturn(Optional.of(user));
		ResultActions response = mockMvc.perform(get("/users/{userId}", user.getUserId()));
		response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.userName", is(user.getUserName())))
				.andExpect(jsonPath("$.age", is(user.getAge()))).andExpect(jsonPath("$.gender", is(user.getGender())))
				.andExpect(jsonPath("$.email", is(user.getEmail())))
				.andExpect(jsonPath("$.mobileNo", is(user.getMobileNo())))
				.andExpect(jsonPath("$.address", is(user.getAddress())))
				.andExpect(jsonPath("$.userType", is(user.getUserType())))
				.andExpect(jsonPath("$.status", is(user.getStatus())));
	}

	@DisplayName("Junit test for update user rest api")
	@Test
	public void givenUserObject_whenUpdateUser_thenReturnUserObject() throws JsonProcessingException, Exception {
		long usrId = 6L;
		User savedUser = user = User.builder().userId(6L).userName("Ramesh").age(25).email("ramesh@gmail.com")
				.gender("Male").mobileNo(9999999999L).address("Mumbai").userType("STU").status("Active").build();
		User updateUser = User.builder().mobileNo(5555554444L).address("kanpur").build();

		BDDMockito.given(userService.getUserById(usrId)).willReturn(Optional.of(savedUser));
		BDDMockito.given(userService.updateUser(any(User.class))).willAnswer(invocation -> invocation.getArgument(0));
		ResultActions response = mockMvc.perform(put("/users/{userId}", usrId).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateUser)));
		response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.mobile", is(updateUser.getMobileNo())))
				.andExpect(jsonPath("$.address", is(updateUser.getAddress())));
	}

	@DisplayName("Junit test for delete user rest api")
	@Test
	public void givenUserObject_whenDeleteById_thenReturnNothing() throws Exception {
		long userId = 3L;
		BDDMockito.willDoNothing().given(userService).deleteUser(userId);
		ResultActions response = mockMvc.perform(delete("/users/{userId}", userId));
		response.andExpect(status().isOk()).andDo(print());
	}

}
