package com.akhilesh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.model.Employee;
import com.akhilesh.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") long empId){
		return employeeService.getEmployeeById(empId);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id")Long empId, @RequestBody Employee updateEmployee) {
		return employeeService.getEmployeeById(empId)
				.map(emp-> {
					emp.setFirstName(updateEmployee.getFirstName());
					emp.setLastName(updateEmployee.getLastName());
					emp.setEmail(updateEmployee.getEmail());
					Employee updEmp = employeeService.updateEmployee(emp);
					return new ResponseEntity<>(updEmp, HttpStatus.OK);
				}).orElseGet(()-> ResponseEntity.notFound().build());
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long empId) {
		employeeService.deleteEmployee(empId);
	}
}
