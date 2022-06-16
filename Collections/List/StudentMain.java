package com.akhilesh.List;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.sid=101;
		st1.sname="Ram";
		st1.rollno=10120;
		Student st2 = new Student();
		st2.sid=102;
		st2.sname="Shyam";
		st2.rollno=10121;
		Student st3 = new Student();
		st3.sid=103;
		st3.sname="Mohan";
		st3.rollno=10122;
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		for(Student st : list) {
			System.out.println("Student Id :"+st.sid);
			System.out.println("Student Name :"+st.sname);
			System.out.println("Student Rollno :"+st.rollno);
		}
	}
}
