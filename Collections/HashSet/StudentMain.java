package com.akhilesh.HashSet;

import java.util.HashSet;

public class StudentMain {

	public static void main(String[] args) {
		HashSet<Student> hset = new HashSet<>();
		Student s1 = new Student(101, "Ram", 5213);
		Student s2 = new Student(102, "Shyam", 3215);
		Student s3 = new Student(103, "Mohan", 1235);
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		for(Student s : hset) {
			System.out.println(s.id+" "+s.name+" "+s.rollno);
		}
	}
}
