package com.akhilesh.streamExamples;

public class Employee {

private long empId;
private String name;
private int age;
private String designation;
private int yearOfJoining;
private double salary;


public Employee(long empId, String name, int age, String designation, int yearOfJoining, double salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.age = age;
	this.designation = designation;
	this.yearOfJoining = yearOfJoining;
	this.salary = salary;
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

public int getYearOfJoining() {
	return yearOfJoining;
}

public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", designation=" + designation
			+ ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
}



}