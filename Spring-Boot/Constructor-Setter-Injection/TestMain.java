package com.akhilesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Spring Container is Ready...");
		System.out.println("----------------------------");
		Hello h = ctx.getBean("hello", Hello.class);
		h.show();
	}
}
