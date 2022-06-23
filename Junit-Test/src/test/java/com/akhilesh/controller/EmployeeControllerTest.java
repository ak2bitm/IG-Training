package com.akhilesh.controller;


import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.akhilesh.model.Employee;
import com.akhilesh.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mocMvc;
	
	@MockBean
	private EmployeeService employeeService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	//Junit test for create employee rest api
	@DisplayName("Junit test for create employee rest api")
	@Test
	public void givenSingleEmployeeObject_whenCreateEmployee_thenReturnSaveEmployee() throws JsonProcessingException, Exception {
		Employee employee = Employee.builder()
							.firstName("Akhilesh")
							.lastName("Patel")
							.email("ak@gmail.com")
							.build();
		BDDMockito.given(employeeService.saveEmployee(any(Employee.class))).willAnswer((invocation)->invocation.getArgument(0));
		ResultActions response = mocMvc.perform(post("/api/employees").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(employee)));
		response.andDo(print())
				.andExpect(status().isCreated())
				.andExpect(jsonPath("$.firstName", is(employee.getFirstName())))
				.andExpect(jsonPath("$.lastName", is(employee.getLastName())))
				.andExpect(jsonPath("$.email", is(employee.getEmail())));
	}
	
	//Junit test for get all employee rest api
	@DisplayName("Junit test for get all employee rest api")
	@Test
	public void givenEmployeeList_whenGetAllEmployee_thenReturnEmployeeList() throws Exception {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(Employee.builder().id(1L).firstName("Akhilesh").lastName("Patel").email("ak@gmail.com").build());
		listOfEmp.add(Employee.builder().id(2L).firstName("Rakesh").lastName("Singh").email("rakesh@gmail.com").build());
		BDDMockito.given(employeeService.getAllEmployee()).willReturn(listOfEmp);
		ResultActions response = mocMvc.perform(get("/api/employees"));
		response.andExpect(status().isOk())
				.andDo(print())
				.andExpect(jsonPath("$.size()", is(listOfEmp.size())));
	}
	
	//Junit test for get employee by id rest api
	@DisplayName("Junit test for get employee by id rest api")
	@Test
	public void givenEmployeeObject_whenGetEmployeeById_thenReturnEmployeeObject() throws Exception {
		Employee employee = Employee.builder()
				.id(1L)
				.firstName("Akhilesh")
				.lastName("Patel")
				.email("ak@gmail.com")
				.build();
		BDDMockito.given(employeeService.getEmployeeById(employee.getId())).willReturn(Optional.of(employee));
		ResultActions response = mocMvc.perform(get("/api/employees/{id}", employee.getId()));
		response
				.andExpect(status().isOk())
				.andDo(print())
				.andExpect(jsonPath("$.firstName", is(employee.getFirstName())))
				.andExpect(jsonPath("$.lastName", is(employee.getLastName())))
				.andExpect(jsonPath("$.email", is(employee.getEmail())));
	}
	
	//Junit test for get employee by id with negative scenario
	@DisplayName("Junit test for get employee by id with negative scenario")
	@Test
	public void givenEmployeeObject_whenGetEmployeeById_thenThrowsExecption() throws Exception {
		long empId = 2L;
		
		BDDMockito.given(employeeService.getEmployeeById(empId)).willReturn(Optional.empty());
		ResultActions response = mocMvc.perform(get("/api/employee/{id}", empId));
		response
				.andExpect(status().isNotFound())
				.andDo(print());
	}
	
	//Junit test for update employee rest api
	@DisplayName("Junit test for update employee rest api")
	@Test
	public void givenEmployeeObject_whenUpdateEmployee_thenReturnUpdateEmployeeObject() throws JsonProcessingException, Exception {
		long empId = 1L;
		Employee saveEmployee = Employee.builder()
				.firstName("Akhilesh")
				.lastName("Patel")
				.email("ak@gmail.com")
				.build();
		Employee updateEmployee = Employee.builder()
				.firstName("Rakesh")
				.lastName("Patel")
				.email("rakesh@gmail.com")
				.build();
		BDDMockito.given(employeeService.getEmployeeById(empId)).willReturn(Optional.of(saveEmployee));
		BDDMockito.given(employeeService.updateEmployee(any(Employee.class))).willAnswer(invocation->invocation.getArgument(0));
		ResultActions response = mocMvc.perform(put("/api/employees/{id}", empId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateEmployee)));
		response.andExpect(status().isOk())
				.andDo(print())
				.andExpect(jsonPath("$.firstName", is(updateEmployee.getFirstName())))
				.andExpect(jsonPath("$.lastName", is(updateEmployee.getLastName())))
				.andExpect(jsonPath("$.email", is(updateEmployee.getEmail())));
	}
	
	//Junit test for update employee rest api with negative scenario
	@DisplayName("Junit test for update employee rest api with negative scenario")
	@Test
	public void givenEmployeeObject_whenUpdateEmployee_thenReturn404() throws JsonProcessingException, Exception {
		long empId = 1L;
		Employee saveEmployee = Employee.builder()
				.firstName("Akhilesh")
				.lastName("Patel")
				.email("ak@gmail.com")
				.build();
		Employee updateEmployee = Employee.builder()
				.firstName("Rakesh")
				.lastName("Patel")
				.email("rakesh@gmail.com")
				.build();
		BDDMockito.given(employeeService.getEmployeeById(empId)).willReturn(Optional.empty());
		BDDMockito.given(employeeService.updateEmployee(any(Employee.class))).willAnswer(invocation->invocation.getArgument(0));
		
		ResultActions response = mocMvc.perform(put("/api/employees/{id}", empId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateEmployee)));
		response.andExpect(status().isNotFound()).andDo(print());
	}
	
	//Junit test for delete employee rest api
	@DisplayName("Junit test for delete employee rest api")
	@Test
	public void givenEmployeeId_whenDeleteEmployee_thenReturn200() throws Exception {
		long empId = 1L;
		BDDMockito.willDoNothing().given(employeeService).deleteEmployee(empId);
		ResultActions response = mocMvc.perform(delete("/api/employees/{id}", empId));
		response.andExpect(status().isOk()).andDo(print());
	}	
}
