package com.itheima.test5;

public class Dog extends Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, double weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃骨头");
	}

	public void lookHome() {
		System.out.println("狗看家");
	}

}
