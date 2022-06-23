package com.akhilesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.akhilesh.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Optional<Employee> getEmployeeById(long empId);
	public Employee updateEmployee(Employee updateEmployee);
	public void deleteEmployee(long empId);
}
