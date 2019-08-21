package com.tricon.demoSpringMongo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	
	@Id
	private String id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String department;
	
	@NotBlank
	private String reportingManager;
	
	@NotNull
	private double salary;
	
	@NotNull
	private int age;
	
	
	public Users(String name, String department, String reportingManager, double salary, int age) {
		super();
		this.name = name;
		this.department = department;
		this.reportingManager = reportingManager;
		this.salary = salary;
		this.age = age;
	}
	
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
