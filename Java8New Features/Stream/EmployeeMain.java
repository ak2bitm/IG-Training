package com.akhilesh.streamExamples;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee(101, "Ram", 35, "Male", "Development", 2001, 30000.0));
		listOfEmployee.add(new Employee(102, "Anita", 30, "FeMale", "Hr", 2005, 20000.0));
		listOfEmployee.add(new Employee(103, "Mohan", 45, "Male", "Development", 2006, 28000.0));
		listOfEmployee.add(new Employee(104, "Shyam", 25, "Male", "Marketing", 2010, 27000.0));
		listOfEmployee.add(new Employee(105, "Surbhi", 45, "FeMale", "Sales", 2011, 22000.0));
		listOfEmployee.add(new Employee(106, "Kanchan", 28, "FeMale", "Hr", 2015, 22000.0));
		listOfEmployee.add(new Employee(107, "Arjun", 40, "Male", "Development", 2016, 38000.0));
		listOfEmployee.add(new Employee(108, "Anamika", 33, "FeMale", "Development", 2016, 33000.0));
		listOfEmployee.add(new Employee(109, "Tejbahadur", 39, "Male", "Marketing", 2018, 29000.0));
		listOfEmployee.add(new Employee(110, "Alok", 35, "Male", "Sales", 2018, 15000.0));
		listOfEmployee.add(new Employee(111, "Ankit", 32, "Male", "Development", 2012, 18000.0));
		listOfEmployee.add(new Employee(112, "Rachana", 38, "FeMale", "Development", 2017, 19000.0));
		listOfEmployee.add(new Employee(113, "Mahima", 45, "FeMale", "Sales", 2019, 21000.0));
		listOfEmployee.add(new Employee(114, "kailash", 30, "Male", "Operation", 2014, 40000.0));
		listOfEmployee.add(new Employee(115, "Sumesh", 24, "Male", "Operation", 2016, 25000.0));
		/*
		//1 How many male and female employees are there in the organization?
		Map<String, Long> NumberOfMaleAndFemaleEmployee = 
		listOfEmployee.stream()
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(NumberOfMaleAndFemaleEmployee);
		
		//2 Print the name of all departments in the organization?
		listOfEmployee.stream()
			.map(Employee::getDepartment).distinct()
			.forEach(System.out::println);
		
		//3 What is the average age of male and female employees?
		Map<String, Double> avgAgeOfMaleAndFemaleEmployee =
		listOfEmployee.stream()
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfMaleAndFemaleEmployee);
		
		//4 Get the details of highest paid employee in the organization?
		Employee heigestPaidEmployee =
		listOfEmployee.stream()
			.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(heigestPaidEmployee.getEmpId());
		System.out.println(heigestPaidEmployee.getName());
		System.out.println(heigestPaidEmployee.getDepartment());
		System.out.println(heigestPaidEmployee.getSalary());
		
		//5 Get the names of all employees who have joined after 2015?
		List<Employee> nameOfEmployeeJoinAfter2015 = 
		listOfEmployee.stream()
		.filter(e-> e.getYearOfJoining() > 2015)
		.collect(Collectors.toList());
		for(Employee e : nameOfEmployeeJoinAfter2015) {
			System.out.println(e.getName());
		}
		
		//6 Count the number of employees in each department?
		Map<String, Long> numberOfEmployeeInEachDept =
		listOfEmployee.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(numberOfEmployeeInEachDept);
		
		//7 What is the average salary of each department?
		Map<String, Double> avgSalaryOfEachDept =
		listOfEmployee.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryOfEachDept);
		
		//8 Get the details of youngest male employee in the product development department?
		Optional<Employee> youngestEmployeeInDevelopmentDept =
		listOfEmployee.stream().filter(e-> e.getDepartment()=="Development")
		.min(Comparator.comparingInt(Employee::getAge));
		System.out.println(youngestEmployeeInDevelopmentDept.get().getEmpId());
		System.out.println(youngestEmployeeInDevelopmentDept.get().getName());
		System.out.println(youngestEmployeeInDevelopmentDept.get().getAge());
		
		//9 Who has the most working experience in the organization?
		Employee mostWorkingExperiance =
		listOfEmployee.stream()
		.min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		System.out.println(mostWorkingExperiance.getEmpId());
		System.out.println(mostWorkingExperiance.getName());
		System.out.println(mostWorkingExperiance.getDepartment());
		
		//10 How many male and female employees are there in the sales and marketing team?
		Map<String, Long> numberOfEmpInSalesAndMarketingDept = 
		listOfEmployee.stream().filter(e-> e.getDepartment()=="Sales" && e.getDepartment()=="Marketing")
		.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(numberOfEmpInSalesAndMarketingDept);
		
		//11 What is the average salary of male and female employees?
		Map<String, Double> avgSalOfMaleAndFemaleEmp =
		listOfEmployee.stream()
		.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalOfMaleAndFemaleEmp);
		
		//12 List down the names of all employees in each department?
		Map<String, List<Employee>> nameOfAllEmpInEachDept =
		listOfEmployee.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(nameOfAllEmpInEachDept);
		Set<Entry<String, List<Employee>>> entrySet = nameOfAllEmpInEachDept.entrySet();
		for(Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("-------------------------------------");
			System.out.println(entry.getKey());
			System.out.println("-------------------------------------");
			List<Employee> emp = entry.getValue();
			for(Employee e : emp) {
				System.out.println(e.getName());
			}
		}
		
		//13 What is the average salary and total salary of the whole organization?
		DoubleSummaryStatistics dss =
		listOfEmployee.stream()
		.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Total Salary :"+dss.getSum());
		System.out.println("Avarage Salary :"+dss.getAverage());
		
		//14 Separate the employees who are younger or equal to 25 years from those
		//employees who are older than 25 years?
		Map<Boolean, List<Employee>> empList =
		listOfEmployee.stream()
		.collect(Collectors.partitioningBy(e->e.getAge() > 25));
		Set<Entry<Boolean, List<Employee>>> entrySet = empList.entrySet();
		for(Entry<Boolean, List<Employee>> entry : entrySet) {
			if(entry.getKey()) {
				System.out.println("Employee Older than 25");
			}else {
				System.out.println("Employee younger than 25");
			}
			List<Employee> emp = entry.getValue();
			for(Employee e : emp) {
				System.out.println(e.getName());
			}
		}
		*/
		//Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Employee emp =
		listOfEmployee.stream()
		.min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getDepartment());
	}
}
