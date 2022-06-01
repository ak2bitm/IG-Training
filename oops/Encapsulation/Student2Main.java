package com.oops.encapsulation;

public class Student2Main {

	public static void main(String[] args) {
		Student2 st = new Student2();
		st.sid = 101;//directly modified using properties
		st.sName="Ram";//directly modified using properties
		System.out.println(st);
	}
}
