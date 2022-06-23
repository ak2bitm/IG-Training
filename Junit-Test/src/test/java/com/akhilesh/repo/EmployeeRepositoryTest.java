package com.akhilesh.repo;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.akhilesh.model.Employee;

@DataJpaTest
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	private Employee employee;
	
	@BeforeEach
	public void setUp() {
		employee = Employee.builder()
				.id(1L)
				.firstName("Akhilesh")
				.lastName("Patel")
				.email("akhilesh@gmail.com")
				.build();
	}
	//Junit Test for save employee
	@DisplayName("Junit Test for save employee")
	@Test
	public void givenEmployeeObject_whenSave_thenReturnSaveEmployee() {
		// given -precondition or setup
		
		//when - action or behavior that we are going to test
		Employee saveEmployee = employeeRepository.save(employee);
		
		//then - verify the output
		assertThat(saveEmployee).isNotNull();
		assertThat(saveEmployee.getId()).isGreaterThan(0);
	}
	//Junit test for get all employee
	@DisplayName("Junit test for get all employee")
	@Test
	public void givenEmployeeObject_whenGetAll_thenReturnEmployeeObject() {
		//given - precondition or setup
		Employee emp1 = Employee.builder()
				.id(2L)
				.firstName("Akhilesh")
				.lastName("Patel")
				.email("akhilesh@gmail.com")
				.build();
		employeeRepository.save(employee);
		employeeRepository.save(emp1);
		
		//when - action or behavior that we are going to test
		List<Employee> empList = employeeRepository.findAll();
		
		//then - verify the output 
		
		assertThat(empList).isNotNull();
		assertThat(empList.size()).isEqualTo(2);
	}
	
	//Junit test for get employee by id
	@DisplayName("Junit test for get employee by id")
	@Test
	public void givenEmployeeObject_whenGetEmployeeById_thenReturnEmployeeObject() {
		employeeRepository.save(employee);
		Employee saveEmployee =employeeRepository.findById(employee.getId()).get();
		assertThat(saveEmployee).isNotNull();
	}
	
	//Junit test for update employee
	@DisplayName("Junit test for update employee")
	@Test
	public void givenEmployeeObject_whenUpdateEmployee_thenReturnEmployeeObject() {
		employeeRepository.save(employee);
		Employee saveEmp = employeeRepository.findById(employee.getId()).get();
		saveEmp.setFirstName("Ratan");
		saveEmp.setLastName("Singh");
		saveEmp.setEmail("ratan@gmail.com");
		Employee updateEmp = employeeRepository.save(saveEmp);
		assertThat(updateEmp.getEmail()).isEqualTo("ratan@gmail.com");
		assertThat(updateEmp.getFirstName()).isEqualTo("Ratan");
	}
	
	//Junit test for delete employee
	@DisplayName("Junit test for delete employee")
	@Test
	public void givenEmployeeObject_whenDeleteById_thenReturnNothing() {
		employeeRepository.save(employee);
		employeeRepository.deleteById(employee.getId());
		Optional<Employee> empDetls = employeeRepository.findById(employee.getId());
		assertThat(empDetls).isEmpty();
	}
	
	
	
	
	
	
	
}
