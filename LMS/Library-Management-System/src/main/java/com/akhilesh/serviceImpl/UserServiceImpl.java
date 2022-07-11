package com.akhilesh.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.akhilesh.entity.User;
import com.akhilesh.exception.ResourceNotFoundException;
import com.akhilesh.repo.UserRepository;
import com.akhilesh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		Optional<User> savedUser = userRepository.findByEmail(user.getEmail());
		if (savedUser.isPresent()) {
			throw new ResourceNotFoundException("User already exist with given email :" + user.getEmail());
		}
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllActiveUsers();
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		return userRepository.getActiveUserById(userId);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User updateUserStatus(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> getById(Long userId) {
		return userRepository.findById(userId);
	}

}
