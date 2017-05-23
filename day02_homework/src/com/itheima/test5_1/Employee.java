package com.itheima.test5_1;

class Employee {
	private String name;
	private String jobNumber;
	private double salary;

	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(String name, String jobNumber, double salary) {
		super();
		this.name = name;
		this.jobNumber = jobNumber;
		this.salary = salary;
		System.out.println("Employee(String name, String jobNumber, double salary)");
	}

	public void work() {
		System.out.println("员工工作");
	}

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
