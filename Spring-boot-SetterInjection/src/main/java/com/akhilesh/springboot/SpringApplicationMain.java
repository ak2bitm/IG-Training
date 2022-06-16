package com.akhilesh.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akhilesh.springboot.component.SetterInjection;
import com.akhilesh.springboot.config.Config;

public class SpringApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		SetterInjection fieldnjection = ctx.getBean(SetterInjection.class);
		fieldnjection.proessMessage("Email Sending");
	}
}
