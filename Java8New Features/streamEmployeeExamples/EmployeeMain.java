package com.akhilesh.streamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Ram", 35, "Manager"));
		empList.add(new Employee(102, "Arti", 28, "Hr"));
		empList.add(new Employee(103, "Shyam", 40, "Developer"));
		empList.add(new Employee(104, "Krishna", 25, "Developer"));
		empList.add(new Employee(105, "Suresh", 45, "Manager"));
		empList.add(new Employee(106, "Disha", 34, "Hr"));
		empList.add(new Employee(107, "Sunil", 30, "Developer"));
		empList.add(new Employee(108, "Kumar", 20, "Developer"));
		empList.add(new Employee(109, "Sumit", 30, "Marketing"));
		empList.add(new Employee(110, "Mukesh", 38, "Manager"));
		//find out all the employees whose designation is “Manager” and age is above 30.
		List<Employee> listEmp =
		empList.stream().filter(emp->emp.getDesignation()=="Manager" && emp.getAge() > 30)
			.collect(Collectors.toList());

		System.out.println("-----------------");
		for(Employee e: listEmp) {
			System.out.println("Employee Id :"+e.getEmpId());
			System.out.println("Employee Name :"+e.getName());
			System.out.println("Age :"+e.getAge());
			System.out.println("Designation :"+e.getDesignation());
			System.out.println("---------------------");
		}
	}
}
