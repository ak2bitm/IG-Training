package com.akhilesh.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.akhilesh.springboot.service.MessageService;

@Component
public class FieldInjection {

	@Autowired
	@Qualifier("emailService")
	private MessageService messageService;
	
	public void proessMessage(String message) {
		messageService.sendMessage(message);
	}
}
