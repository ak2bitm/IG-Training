package com.akhilesh.staticMethod;

public class Hai implements Hello{

	@Override
	public void message() {
		System.out.println("Hai-message()-overridden abstract method");
	}
	
	
	public static void m1() {
		System.out.println("Hai-m1()-method");
	}
	@Override
	public void m3() {
		System.out.println("Hai-m3()-overridden default method");
	}

}
