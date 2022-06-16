package com.akhilesh.springboot.service;

import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
