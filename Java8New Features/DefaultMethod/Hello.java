package com.akhilesh.defaultMethod;


public interface Hello {

	public void message();
	default void m1() {
		System.out.println("Hello- m1()");
	}
	default void m2() {
		System.out.println("Hello-m2()");
	}
}
