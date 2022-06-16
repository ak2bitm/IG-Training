package com.akhilesh.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akhilesh.springboot.component.ConstructorInjection;
import com.akhilesh.springboot.config.Config;

public class SpringApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ConstructorInjection fieldnjection = ctx.getBean(ConstructorInjection.class);
		fieldnjection.proessMessage("Email Sending");
	}
}
