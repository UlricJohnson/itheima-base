package com.itheima.test5;

public class Test5 {

	public static void main(String[] args) {
		Animal animal1 = new Dog("旺财", 14.5);
		Animal animal2 = new Cat("Tom", 4.8);

		animal1.eat();
		animal2.eat();

		// Dog dog = (Dog) animal1;
		// dog.lookHome();

		// Cat cat = (Cat) animal2;
		// cat.catchMouse();

		useAni(animal1);
		useAni(animal2);
	}

	public static void useAni(Animal a) {
		if (a instanceof Dog) {
			Dog dog = (Dog) a;
			dog.lookHome();
		} else {
			Cat cat = (Cat) a;
			cat.catchMouse();
		}
	}

}
