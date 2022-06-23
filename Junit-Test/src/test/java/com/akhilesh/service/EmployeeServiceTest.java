package com.akhilesh.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.akhilesh.exception.ResourceNotFoundException;
import com.akhilesh.model.Employee;
import com.akhilesh.repo.EmployeeRepository;
import com.akhilesh.serviceImpl.EmployeeServiceImpl;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	private Employee employee;
	
	@BeforeEach
	public void setUp() {
		employee = Employee.builder()
				    .id(1L)
					.firstName("Akhilesh")
					.lastName("Patel")
					.email("ak@gmail.com")
					.build();
	}
	//Junit test for save employee
	@DisplayName("Junit test for save employee")
	@Test
	public void givenEmployeeObject_whenSaveEmployee_thenReturnEmployeeObject() {
		BDDMockito.given(employeeRepository.findByEmail(employee.getEmail())).willReturn(Optional.empty());
		BDDMockito.given(employeeRepository.save(employee)).willReturn(employee);
		
		Employee savedEmployee = employeeService.saveEmployee(employee);
		assertThat(savedEmployee).isNotNull();
	}
	
	//Junit test for save employee which throws exception
	@DisplayName("Junit test for save employee which throws exception")
	@Test
	public void givenExistingEmail_whenSaveEmployee_thenThrowException() {
		BDDMockito.given(employeeRepository.findByEmail(employee.getEmail())).willReturn(Optional.of(employee));
		
		assertThrows(ResourceNotFoundException.class, ()->{
			employeeService.saveEmployee(employee);
		});
		
		verify(employeeRepository, never()).save(any(Employee.class));
	}
	
	//Junit test for get all employee
	@Test
	public void givenEmployeeListObject_whenGetAllEmployee_thenReturnEmployeeList() {
		Employee employee1 = Employee.builder()
							.id(2L)
				            .firstName("Roshani")
				            .lastName("Patel")
				            .email("roshani@gmail.com")
				            .build();
		BDDMockito.given(employeeRepository.findAll()).willReturn(List.of(employee, employee1));
		List<Employee> savedEmployee = employeeService.getAllEmployee();
		assertThat(savedEmployee).isNotNull();
		assertThat(savedEmployee.size()).isEqualTo(2);
	}
	
	//junit test for get all employee with negative scenario
	@Test
	public void givenEmptyEmployeeList_whenFindAll_thenReturnEmptyList() {
		
		BDDMockito.given(employeeRepository.findAll()).willReturn(Collections.emptyList());
		List<Employee> savedEmployee = employeeService.getAllEmployee();
		assertThat(savedEmployee).isEmpty();
		assertThat(savedEmployee.size()).isEqualTo(0);
	}
	
	//Junit test for get employee by id
	@Test
	public void givenEmployeeObject_whenFindById_thenReturnEmployeeObject() {
		BDDMockito.given(employeeRepository.findById(employee.getId())).willReturn(Optional.of(employee));
		Employee savedEmployee = employeeService.getEmployeeById(employee.getId()).get();
		assertThat(savedEmployee).isNotNull();
	}
	
	//Junit test for update employee
	@Test
	public void givenEmployeeObject_whenUpdayeEmployee_thenReturnEmployeeObject() {
		BDDMockito.given(employeeRepository.save(employee)).willReturn(employee);
		employee.setFirstName("Rohit");
		employee.setEmail("rohit@gmail.com");
		Employee savedEmployee = employeeService.updateEmployee(employee);
		assertThat(savedEmployee.getFirstName()).isEqualTo("Rohit");
		assertThat(savedEmployee.getEmail()).isEqualTo("rohit@gmail.com");
	}
	//Junit for delete employee
	@Test
	public void givenEmployeeObject_whenDeleteEmployee_thenReturnNothing() {
		long employeeId = 1L;
		BDDMockito.willDoNothing().given(employeeRepository).deleteById(1L);
		employeeService.deleteEmployee(employeeId);
		verify(employeeRepository, times(1)).deleteById(employeeId);
	}
	
}
