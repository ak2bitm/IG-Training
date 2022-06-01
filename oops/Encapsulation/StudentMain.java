package com.oops.encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student();
		st.setSid(101);
		st.setSname("Ramesh");
		st.setEmail("ramesh@gmail.com");
		System.out.println("Student id :"+st.getSid());
		System.out.println("Student name :"+st.getSname());
		System.out.println("Student email :"+st.getEmail());
	}
}
