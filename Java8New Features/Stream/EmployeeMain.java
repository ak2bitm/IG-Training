package com.akhilesh.stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Ram", "male", 85000.0, "development", 2001));
		list.add(new Employee(102, "Shyam", "male", 55000.0, "development", 2005));
		list.add(new Employee(103, "Rohan", "male", 65000.0, "development", 2002));
		list.add(new Employee(104, "Mukesh", "male", 50000.0, "product", 2007));
		list.add(new Employee(105, "Sunil", "male", 25000.0, "development", 2010));
		list.add(new Employee(106, "Ratan", "male", 30000.0, "sales", 2012));
		list.add(new Employee(107, "Sanjay", "male", 25000.0, "marketing", 2006));
		list.add(new Employee(108, "Arti", "female", 75000.0, "hr", 2001));
		list.add(new Employee(109, "Anita", "female", 25000.0, "development", 2011));
		list.add(new Employee(110, "Karishma", "female", 30000.0, "marketing", 2022));
		list.add(new Employee(111, "Ram", "male", 45000.0, "sales", 2015));
		list.add(new Employee(112, "Satish", "male", 55000.0, "hr", 2015));
		list.add(new Employee(113, "Kunj", "male", 25000.0, "development", 2016));
		
		//Finding all distinct salaries among all employees
		list.stream().distinct().map(Employee::getSalary).forEach(System.out::println);
		System.out.println("-----------------------------");
		//count number of male and female employee
		//select count(empId) from employee group by gender
		Map<String, Long> noOfMaleAndFemaleEmployee = 
		list.stream()
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployee);
		System.out.println("----------------------------");
		//get all department list
		list.stream().map(Employee::getDepartment)
			.distinct().forEach(System.out::println);
		//
	}
}
