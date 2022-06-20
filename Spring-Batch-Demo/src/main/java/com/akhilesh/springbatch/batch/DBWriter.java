package com.akhilesh.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akhilesh.springbatch.model.UserModel;
import com.akhilesh.springbatch.repo.UserRepository;

@Component
public class DBWriter implements ItemWriter<UserModel>{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void write(List<? extends UserModel> users) throws Exception {
		System.out.println("Data saved for users :"+users);
		userRepository.saveAll(users);
	}

}
