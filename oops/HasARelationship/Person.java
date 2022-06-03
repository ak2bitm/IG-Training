package com.akhilesh.HasARelationship;

public class Person {

	String name;
	Address address = new Address();
	void display(String name, Address add) {
		System.out.println("Person Name :"+name);
		System.out.println("Address :"+add.city+" "+add.country+" "+add.state+" "+add.pin);
	}
	
}
