package com.akhilesh.MethodReferences;

public class MainTest3 {

	public static void main(String[] args) {
		//Lambda Style
		MyStudent ms1 = (a,b,c)->{
			Course course = new Course(a, b, c);
			return course;
		};
		Course course1 =ms1.getCourse(101, "Ram", "ram@gmail.com");
		System.out.println(course1);
		//Method Reference Style
		MyStudent ms2 = Course::new;
		Course course2 = ms2.getCourse(102, "Shyam", "shyam@gmail.com");
		System.out.println(course2);
		
	}
}
