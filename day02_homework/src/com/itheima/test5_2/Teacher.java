package com.itheima.test5_2;

public class Teacher extends Person {

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void teach() {
		System.out.println(this.getName() + "的工作就是讲课");
	}

}
