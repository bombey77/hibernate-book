package com.hibernate.motovilov.entity;

public class Instructor extends User6 {

	private Double salary;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName, String email, Double salary) {
		super(firstName, lastName, email);
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
