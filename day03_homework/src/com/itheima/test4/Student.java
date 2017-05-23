package com.itheima.test4;

public class Student {
	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 学习
	public void study() {
		System.out.println("开始学习");
	}

	// 睡觉
	public void sleep() {
		System.out.println("学了一天，该睡觉了");
	}

	// get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
