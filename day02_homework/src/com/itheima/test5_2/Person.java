package com.itheima.test5_2;

public class Person {
	private String name;
	private int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("人是铁饭是钢，一顿不吃饿得慌");
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
