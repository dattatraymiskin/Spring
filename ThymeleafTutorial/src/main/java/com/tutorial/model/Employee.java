package com.tutorial.model;


public class Employee {

	private String name;
	private String mob;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, String mob, double salary) {
		super();
		this.name = name;
		this.mob = mob;
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	 
}
