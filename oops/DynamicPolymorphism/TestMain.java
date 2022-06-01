package com.oops.dynamicPolymorphism;

public class TestMain {

	public static void main(String[] args) {
		Person p = new Employee();
		p.eating();
		p.walking();
		//p.sleeping();
		
		System.out.println("------------");
		Person p2 = new Student();
		//p2.sleeping();
		//p.eating();
		p2.walking();
	}
}
