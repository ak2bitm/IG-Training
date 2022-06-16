package com.akhilesh.springboot.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akhilesh.springboot.service.MessageService;

@Component
public class SetterInjection {

	
	private MessageService messageService;

	@Autowired
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}



	public void proessMessage(String message) {
		messageService.sendMessage(message);
	}
}
