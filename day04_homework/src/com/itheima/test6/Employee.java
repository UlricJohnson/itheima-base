package com.itheima.test6;

public abstract class Employee {
	private String name;
	private String jobNumber;
	private double salary;

	public Employee() {
	}

	public Employee(String name, String jobNumber, double salary) {
		super();
		this.name = name;
		this.jobNumber = jobNumber;
		this.salary = salary;
	}

	public abstract void work();

	public abstract void meet();

}
