package com.itheima.test5_2;

public class Student extends Person {

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void study() {
		System.out.println(this.getName() + "要学习");
	}

}
