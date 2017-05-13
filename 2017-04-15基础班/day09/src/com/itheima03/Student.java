package com.itheima03;

public class Student {
	private String name;
	private String age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

}
