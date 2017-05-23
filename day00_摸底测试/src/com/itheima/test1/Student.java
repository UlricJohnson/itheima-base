package com.itheima.test1;

public class Student {
	private String name;
	private char sex;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, char sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
