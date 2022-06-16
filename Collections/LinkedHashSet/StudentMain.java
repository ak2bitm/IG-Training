package com.akhilesh.LinkedHashSet;

import java.util.LinkedHashSet;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Ram", "Delhi");
		Student s2 = new Student(102, "Sohan", "Banglore");
		Student s3 = new Student(103, "Mohan", "Mumbai");
		
		LinkedHashSet<Student> lhset = new LinkedHashSet<>();
		lhset.add(s1);
		lhset.add(s2);
		lhset.add(s3);
		for(Student s: lhset) {
			System.out.println(s.id+" "+s.name+" "+s.city);
		}
	}
}
