package com.akhilesh.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.akhilesh.entity.User;
import com.akhilesh.exception.ResourceNotFoundException;
import com.akhilesh.repo.UserRepository;
import com.akhilesh.serviceImpl.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserServiceImpl userService;

	private User user;

	@BeforeEach
	public void setUpUser() {
		user = User.builder().userName("Ramesh").age(25).email("ramesh@gmail.com").gender("Male").mobileNo(9999999999L)
				.address("Mumbai").userType("STU").build();
	}

	@DisplayName("Junit test for save user")
	@Test
	public void givenUserObject_whenSave_thenReturnUserObject() {
		BDDMockito.given(userRepository.save(user)).willReturn(user);
		User savedUser = userService.createUser(user);
		assertThat(savedUser).isNotNull();
	}

	@DisplayName("Junit test for save user which throw exception")
	@Test
	public void givenUserObject_whenSave_thenThrowException() {
		BDDMockito.given(userRepository.findByEmail(user.getEmail())).willReturn(Optional.of(user));
		assertThrows(ResourceNotFoundException.class, () -> {
			userService.createUser(user);
		});
		verify(userRepository, never()).save(any(User.class));
	}

	@DisplayName("Junit test for get all user")
	@Test
	public void givenUserObject_whenGetAllUser_thenReturnUserList() {
		BDDMockito.given(userRepository.findAll()).willReturn(List.of(user));
		List<User> usrList = userService.getAllUsers();
		assertThat(usrList).isNotNull();
		assertThat(usrList.size()).isEqualTo(1);
	}

	@DisplayName("Junit test for get user by id")
	@Test
	public void givenUserObject_whenFindById_thenReturnUserObject() {
		BDDMockito.given(userRepository.findById(user.getUserId())).willReturn(Optional.of(user));
		User savedUser = userService.getUserById(user.getUserId()).get();
		assertThat(savedUser).isNotNull();
	}

	@DisplayName("Junit test for update user")
	@Test
	public void givenUserObject_whenUpdateUser_thenReturnUserObject() {
		BDDMockito.given(userRepository.save(user)).willReturn(user);
		user.setAddress("Pune");
		user.setMobileNo(8888888881L);
		User updateUser = userService.updateUser(user);
		assertThat(updateUser.getAddress()).isEqualTo("Pune");
		assertThat(updateUser.getMobileNo()).isEqualTo(8888888881L);
	}

	@DisplayName("Junit test for delete user")
	@Test
	public void givenUserObject_whenDeleteById_thenReturnNothing() {
		long userId = 5L;
		BDDMockito.willDoNothing().given(userRepository).deleteById(userId);
		userService.deleteUser(userId);
		verify(userRepository, times(1)).deleteById(userId);
	}
}
