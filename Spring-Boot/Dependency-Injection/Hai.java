package com.akhilesh.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component// To make understand applicationContext is a bean
@Scope("prototype")
public class Hai {

	private int id;
	private String name;
	
	@Autowired
	private Hello hello;
	
	public Hai() {
		System.out.println("Hai-Default Constructor");
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
	public void show() {
		System.out.println("show() in - Hai");
		hello.showInHello();
	}
}
