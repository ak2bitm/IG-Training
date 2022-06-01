package com.oops.StaticPolymorphism;

public class StaticPolymorphism {

	
	void sum() {
		System.out.println("no-agr sum()");
	}
	void sum(int a, int b) {
		System.out.println("Addition of two numbers is :"+(a+b));
	}
	void sum(int a, int b, int c) {
		System.out.println("Addition of three numbers is :"+(a+b+c));
	}
	static void sum(int a, double b) {
		System.out.println("Addition of int and double is :"+(a+b));
	}
	static void sum(int a, double b, int c) {
		System.out.println("Addition of int, double and int is :"+(a+b+c));
	}
}
