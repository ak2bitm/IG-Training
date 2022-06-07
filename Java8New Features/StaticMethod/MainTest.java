package com.akhilesh.staticMethod;

public class MainTest {

	public static void main(String[] args) {
		Hai h = new Hai();
		h.m1();//newly defined static method
		h.m3();//overridden default method
		h.m4();//inherited default method
		h.message();//overridden abstract method
	}
}
