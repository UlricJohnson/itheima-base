package com.itheima4;

/**
 * 标准的类的写法
 * 
 * @author Ulric
 *
 */

public class Student {
	private String name;
	private int age;

	// 构造方法
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getters & setters
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
