package com.itheima.test01;

/**
 * (2).程序员类Coder
 * 
 * 属性：
 * 
 * 姓名name
 * 
 * 工号id
 * 
 * 工资salary
 * 
 * 行为：
 * 
 * 工作work()
 * 
 * @author Ulric
 *
 */

public class Coder {
	private String name;
	private String id;
	private double salary;

	public Coder() {
		// TODO Auto-generated constructor stub
	}

	public Coder(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println("工号为" + id + "基本工资为" + salary + "的程序员正在努力的写着代码......");
	}

}
