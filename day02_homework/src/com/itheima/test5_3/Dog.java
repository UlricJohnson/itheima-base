package com.itheima.test5_3;

public class Dog extends Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String color, int numOfLeg) {
		super(color, numOfLeg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("狗啃骨头");
	}

	public void lookHome() {
		System.out.println("狗可以看家");
	}
}
