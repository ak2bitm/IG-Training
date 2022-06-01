package com.oops.dynamicPolymorphism;

public class Student extends Person{

	void reading() {
		System.out.println("student reading");
	}
	@Override
	void walking() {
		System.out.println("student walking");
	}
	static void sleeping() {
		System.out.println("student sleeping");
	}
}
