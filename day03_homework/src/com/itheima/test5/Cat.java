package com.itheima.test5;

public class Cat extends Animal {

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, double weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
}
