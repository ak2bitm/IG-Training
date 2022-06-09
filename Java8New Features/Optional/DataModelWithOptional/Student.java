package com.akhilesh.Optional.DataModelWithOptional;

import java.util.Optional;

public class Student {

	private String studentName;
	private String studentEmail;
	private String studentContact;
	private Optional<Course> course;
	public Student() {
		super();
	}
	public Student(String studentName, String studentEmail, String studentContact, Optional<Course> course) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentContact = studentContact;
		this.course = course;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	public Optional<Course> getCourse() {
		return course;
	}
	public void setCourse(Optional<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentEmail=" + studentEmail + ", studentContact="
				+ studentContact + ", course=" + course + "]";
	}
	
}
