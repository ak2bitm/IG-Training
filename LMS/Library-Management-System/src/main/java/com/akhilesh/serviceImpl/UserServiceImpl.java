package com.akhilesh.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhilesh.entity.User;
import com.akhilesh.exception.ResourceNotFoundException;
import com.akhilesh.repo.UserRepository;
import com.akhilesh.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		Optional<User> savedUser = userRepository.findByEmail(user.getEmail());
		if(savedUser.isPresent()) {
			throw new ResourceNotFoundException("User already exist with given email :"+user.getEmail());
		}
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		return userRepository.findById(userId);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

}
