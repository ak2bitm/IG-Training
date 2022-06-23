package com.akhilesh.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findByEmail(String email);
}
