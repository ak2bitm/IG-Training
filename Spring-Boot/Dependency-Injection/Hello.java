package com.akhilesh.springboot;

import org.springframework.stereotype.Component;

@Component
public class Hello {

	private int id;
	private String name;
	
	
	public Hello() {
		System.out.println("Hello-Default constructor");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInHello() {
		System.out.println("showInHello() in -Hello");
	}
}
