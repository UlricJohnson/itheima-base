package com.itheima.test02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("花色", "波斯猫");
		cat.eat();
		cat.catchMouse();

		Dog dog = new Dog();
		dog.setColor("黑色");
		dog.setBreed("藏獒");
		dog.eat();
		dog.lookHome();
	}

}
