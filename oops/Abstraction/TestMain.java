package com.oops.abstraction;

public class TestMain {

	public static void main(String[] args) {
		/*
		MyTest t1 = new MyTest();
		t1.calcute(10, 2);
		t1.calcute(2, 2);
		t1.calcute(3, 3);
		*/
		MyTest t1 = new MyTest();
		t1.addition(2, 2);
		t1.multiplication(2, 3);
		t1.substration(10, 2);
		System.out.println("-----------------");
		MyTest t2 = new MyTest();
		t2.addition(2, 2);
		t2.multiplication(2, 3);
		t2.substration(10, 2);
	}
}
