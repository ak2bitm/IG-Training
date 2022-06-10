package com.akhilesh.streamExamples;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Ram", 35, "Manager",2001,35000.0));
		empList.add(new Employee(102, "Arti", 28, "Hr",2002,25000.0));
		empList.add(new Employee(103, "Shyam", 40, "Developer",2002,15000.0));
		empList.add(new Employee(104, "Krishna", 25, "Developer",2002,18000.0));
		empList.add(new Employee(105, "Suresh", 45, "Manager",2001,25000.0));
		empList.add(new Employee(106, "Disha", 34, "Hr",2001,30000.0));
		empList.add(new Employee(107, "Sunil", 30, "Developer",2010,20000.0));
		empList.add(new Employee(108, "Kumar", 20, "Developer",2020,20000.0));
		empList.add(new Employee(109, "Sumit", 30, "Marketing",2012,18000.0));
		empList.add(new Employee(110, "Mukesh", 25, "Manager",2005,37000.0));
		empList.add(new Employee(111, "Mukesh", 55, "Marketing",2005,21000.0));
		empList.add(new Employee(112, "Vivek", 28, "Hr",2005,24000.0));
		empList.add(new Employee(113, "Sanjay", 22, "Hr",2005,28000.0));
		empList.add(new Employee(114, "Ram", 29, "Sales",2005,22000.0));
		empList.add(new Employee(115, "Suresh", 25, "Sales",2005,19000.0));
		
		//find out all the employees whose designation is “Manager” and age is above 30.
		// select * from employee where designation ="Manager" and age>30;
		/*
		List<Employee> listEmp =
		empList.stream().filter(emp->emp.getDesignation()=="Manager" && emp.getAge() > 30)
			.collect(Collectors.toList());

		System.out.println("-----------------");
		for(Employee e: listEmp) {
			System.out.println("Employee Id :"+e.getEmpId());
			System.out.println("Employee Name :"+e.getName());
			System.out.println("Age :"+e.getAge());
			System.out.println("Designation :"+e.getDesignation());
			System.out.println("-------------------------------------------------------");
		}
		System.out.println("********************************************************");
		// print the number of employees per designation in the organization
		Map<String, Long> listEmpByDesig = 
		empList.stream().collect(Collectors.groupingBy(Employee::getDesignation, Collectors.counting()));
		//System.out.println(listEmpByDesig);
		Set<Entry<String, Long>> entrySet = listEmpByDesig.entrySet();
		for(Entry<String, Long> k : entrySet) {
			System.out.println(k.getKey()+" : "+k.getValue());
		}
		
		// display all the unique designation
		empList.stream().map(Employee::getDesignation).distinct()
			.collect(Collectors.toList()).forEach(System.out::println);
		
		//Separate employee greater then 30
		Map<Boolean, List<Employee>> empSepar =
		empList.stream().collect(Collectors.partitioningBy(e-> e.getAge() > 30));
		Set<Entry<Boolean, List<Employee>>> entrySet = empSepar.entrySet();
		for(Entry<Boolean, List<Employee>> entry : entrySet) {
			System.out.println("--------------------------------------");
			if(entry.getKey()) {
				System.out.println("------------------------------");
				System.out.println("Employee older than 30");
			}else {
				System.out.println("Employee younger than 30");
			}
			System.out.println("-----------------------------------");
			List<Employee> emplist = entry.getValue();
			for(Employee e: emplist) {
				System.out.println(e.getName());
			}
		}
		
		//List the employees name who joined before 2010
		empList.stream().filter(e->e.getYearOfJoining() < 2010).map(Employee::getName)
			.collect(Collectors.toList()).forEach(System.out::println);
		
		//List the employees who does not belong to designation name Developer 
		empList.stream().filter(e->e.getDesignation() !="Developer" && e.getDesignation()!="Hr")
			.map(Employee::getName)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		//What is the average salary of each designation
		 Map<String, Double> avgSalEachDeg =
		empList.stream()
		.collect(
				Collectors.groupingBy(
						Employee::getDesignation, 
						Collectors.averagingDouble(Employee::getSalary)
						));
		 System.out.println(avgSalEachDeg);
		
		// youngest employee in Development designation 
		Employee emp =
		empList.stream().filter(e->e.getDesignation()=="Developer")
			.min(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("Emp Id :"+emp.getEmpId());
		System.out.println("Name :"+emp.getName());
		System.out.println("Designation :"+emp.getDesignation());
		System.out.println("Age :"+emp.getAge());
		*/
		// most experienced employee
		Optional<Employee> mostExpEmp = 
		empList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		System.out.println("Emp Id :"+mostExpEmp.get().getEmpId());
		System.out.println("Name :"+mostExpEmp.get().getName());
		System.out.println("Designation :"+mostExpEmp.get().getDesignation());
		System.out.println("Age :"+mostExpEmp.get().getAge());
		System.out.println("Year of Joining :"+mostExpEmp.get().getYearOfJoining());
		
	}
}
