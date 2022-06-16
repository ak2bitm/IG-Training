package com.akhilesh.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akhilesh.springboot.component.FieldInjection;
import com.akhilesh.springboot.config.Config;

public class SpringApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		FieldInjection fieldnjection = ctx.getBean(FieldInjection.class);
		fieldnjection.proessMessage("Email Sending");
	}
}
