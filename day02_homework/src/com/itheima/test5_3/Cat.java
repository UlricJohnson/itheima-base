package com.itheima.test5_3;

public class Cat extends Animal {

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String color, int numOfLeg) {
		super(color, numOfLeg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("猫可以捉老鼠");
	}

}
