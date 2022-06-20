package com.akhilesh.springbatch.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserModel {

	@Id
	private int id;
	private String name;
	private String dept;
	private int salary;
	private LocalDateTime time;
	public UserModel() {
		super();
	}
	
	public UserModel(int id, String name, String dept, int salary, LocalDateTime time) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.time = time;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", time=" + time
				+ "]";
	}
	
	
}
