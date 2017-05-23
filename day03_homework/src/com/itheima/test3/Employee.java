package com.itheima.test3;

public abstract class Employee {
	private String name;
	private String jobNumber;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String jobNumber, double salary) {
		super();
		this.name = name;
		this.jobNumber = jobNumber;
		this.salary = salary;
	}

	public void meet() {
		System.out.println("员工每周都需要开会");
	}

	public abstract void work();

	// get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
