package com.akhilesh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApplicationMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringApplicationMain.class, args);
		/**
		 * If we don't annotate Hai class as @Component then will get NoSuchBeanException.
		 * In Hai class I have declared one default constructor and print some message.
		 * If I run this without calling getBean() and show() method than we can see on console 
		 * that it printing the message Default-Constructor.
		 * It means that bean is available in the application context(classes that is marked with @Component)
		 * 
		 */
		Hai h = context.getBean(Hai.class);
		h.show();
		/**
		 * In this again we are calling getBean() method and scope is prototype than default constructor
		 * will be called into two times
		 * Application context does not create the Hai object until we don't calling getBean() method
		 */
		Hai h1 = context.getBean(Hai.class);
		h1.show();
		
	}
}
