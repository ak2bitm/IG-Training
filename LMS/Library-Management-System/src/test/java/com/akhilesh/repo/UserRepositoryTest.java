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

import com.akhilesh.entity.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	private User user;
	
	@BeforeEach
	public void setUpUser() {
		user	=	User.builder()
						.userName("Ramesh")
						.age(25)
						.email("ramesh@gmail.com")
						.gender("Male")
						.mobileNo(9999999999L)
						.address("Mumbai")
						.userType("STU")
						.build();
	}
	
	@DisplayName("Junit test for save user")
	@Test
	public void givenUserObject_whenSave_thenReturnUser() {
		User savedUser = userRepository.save(user);
		assertThat(savedUser).isNotNull();
		assertThat(savedUser.getUserId()).isGreaterThan(0);
	}
	
	@DisplayName("Junit Test for get All Employee")
	@Test
	public void givenUserListObject_whenFindAll_thenReturnUserList() {
		
		userRepository.save(user);
		List<User> userList = userRepository.findAll();
		assertThat(userList).isNotNull();
		assertThat(userList.size()).isEqualTo(9);
	}
	
	@DisplayName("Junit test for get user by user id")
	@Test
	public void givenUserObject_whenFindById_thenReturnUser() {
		userRepository.save(user);
		User savedUser = userRepository.findById(user.getUserId()).get();
		assertThat(savedUser).isNotNull();
	}
	
	@DisplayName("Junit test for update user")
	@Test
	public void givenUserObject_whenUpdate_thenReturnUser() {
		userRepository.save(user);
		User savedUser = userRepository.findById(user.getUserId()).get();
						savedUser.setEmail("rahul@gmail.com");
						savedUser.setMobileNo(9999999911L);
		User updateUser = userRepository.save(savedUser);
		assertThat(updateUser.getEmail()).isEqualTo("rahul@gmail.com");
		assertThat(updateUser.getMobileNo()).isEqualTo(9999999911L);
	}
	
	@DisplayName("Junit test for delete user")
	@Test
	public void givenUserObject_whenDelete_thenReturnNothing() {
		userRepository.save(user);
		userRepository.deleteById(user.getUserId());
		Optional<User> usrDetls=userRepository.findById(user.getUserId());
		assertThat(usrDetls).isEmpty();
	}
}
