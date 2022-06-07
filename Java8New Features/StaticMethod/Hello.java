package com.akhilesh.staticMethod;

public interface Hello {

	public void message();
	static void m1() {
		System.out.println("Hello-m1()-static method");
	}
	static void m2() {
		System.out.println("Hello-m2()-static method");
	}
	
	default void m3() {
		System.out.println("Hello-m3()-default method");
	}
	default void m4() {
		System.out.println("Hello-m4()-default method");
	}
}
