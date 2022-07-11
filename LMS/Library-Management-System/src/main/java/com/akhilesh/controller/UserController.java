package com.akhilesh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.entity.User;
import com.akhilesh.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public User saveUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}

	@PutMapping("/users/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable long userId, @RequestBody User user) {
		return userService.getUserById(userId).map(usr -> {
			usr.setMobileNo(user.getMobileNo());
			usr.setAddress(user.getAddress());
			User userUpdate = userService.updateUser(usr);
			return new ResponseEntity<>(userUpdate, HttpStatus.OK);
		}).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable long userId) {
		userService.deleteUser(userId);
	}

	@PatchMapping("/users/status/{userId}")
	public ResponseEntity<User> updateUserStatus(@PathVariable long userId, @RequestBody User patchUser) {
		return userService.getById(userId).map(usr -> {
			usr.setStatus(patchUser.getStatus());
			User updateUser = userService.updateUserStatus(usr);
			return new ResponseEntity<>(updateUser, HttpStatus.OK);
		}).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
