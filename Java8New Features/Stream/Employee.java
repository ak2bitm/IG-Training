package com.akhilesh.stream;

public class Employee {

	private int empId;
	private String name;
	private String gender;
	private double salary;
	private String department;
	private int yearOfJoining;
	
	public Employee(int empId, String name, String gender, double salary, String department, int yearOfJoining) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
	}


	public int getEmpId() {
		return empId;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public String getDepartment() {
		return department;
	}


	public int getYearOfJoining() {
		return yearOfJoining;
	}


	public String getGender() {
		return gender;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", department=" + department + ", yearOfJoining=" + yearOfJoining + "]";
	}


	
}
