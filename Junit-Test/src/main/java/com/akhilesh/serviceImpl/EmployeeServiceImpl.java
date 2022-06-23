package com.akhilesh.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.ResourceClosedException;
import org.springframework.stereotype.Service;

import com.akhilesh.exception.ResourceNotFoundException;
import com.akhilesh.model.Employee;
import com.akhilesh.repo.EmployeeRepository;
import com.akhilesh.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		Optional<Employee> saveEmployee = employeeRepository.findByEmail(employee.getEmail());
		if(saveEmployee.isPresent()) {
			throw new ResourceNotFoundException("Employee already exist with given email:"+employee.getEmail());
		}
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(long empId) {
		return employeeRepository.findById(empId);
	}

	@Override
	public Employee updateEmployee(Employee updateEmployee) {
		return employeeRepository.save(updateEmployee);
	}

	@Override
	public void deleteEmployee(long empId) {
		employeeRepository.deleteById(empId);		
	}
	
}
