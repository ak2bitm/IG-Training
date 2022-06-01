package com.oops.dynamicPolymorphism;

public class Employee extends Person{

	void working() {
		System.out.println("employee working");
	}
	@Override
	void walking() {
		System.out.println("employee walking");
	}
	static void sleeping() {
		System.out.println("employee sleeping");
	}
}
