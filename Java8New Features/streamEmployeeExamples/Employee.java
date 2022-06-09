package com.akhilesh.streamExamples;

public class Employee {

private long empId;
private String name;
private int age;
private String designation;
public Employee(long empId, String name, int age, String designation) {
	super();
	this.empId = empId;
	this.name = name;
	this.age = age;
	this.designation = designation;
}
public long getEmpId() {
	return empId;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getDesignation() {
	return designation;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", designation=" + designation + "]";
}


}