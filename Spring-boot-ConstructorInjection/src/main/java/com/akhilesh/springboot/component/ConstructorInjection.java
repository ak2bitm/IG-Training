package com.akhilesh.springboot.component;


import org.springframework.stereotype.Component;

import com.akhilesh.springboot.service.MessageService;

@Component
public class ConstructorInjection {

	
	private MessageService messageService;
	
	public ConstructorInjection(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	public void proessMessage(String message) {
		messageService.sendMessage(message);
	}
}
