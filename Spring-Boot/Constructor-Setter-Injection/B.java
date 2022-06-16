package com.akhilesh;

public class B {

	private int b;
	private String str;
	
	public B(int b, String str) {
		System.out.println("B-2-Arg Constructor");
		this.b = b;
		this.str = str;
	}
	
	public void showB() {
		System.out.println("B-showB()");
		System.out.println(b);
		System.out.println(str);
	}
}
