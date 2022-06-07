package com.akhilesh.LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Chandu"));
		empList.add(new Employee(102, "Golu"));
		empList.add(new Employee(103, "Amit"));
		empList.add(new Employee(104, "Sumit"));
		empList.add(new Employee(105, "Ratan"));
		System.out.println("Original List :");
		for(Employee e: empList) {
			System.out.println(e.getEmpId()+" : "+e.getEmpName());
		}
		System.out.println("Sort Employee List using Lambda");
		Collections.sort(empList, (e1,e2)->{
			return e1.getEmpName().compareTo(e2.getEmpName());
		});
		for(Employee e: empList) {
			System.out.println(e.getEmpId()+" : "+e.getEmpName());
		}
	}
}
