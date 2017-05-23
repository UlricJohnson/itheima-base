package com.itheima;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		Person[] persons = new Person[6];

		persons[0] = new Person("张三", 40);
		persons[1] = new Person("李四", 44);
		persons[2] = new Person("王五", 37);
		persons[3] = new Person("马六", 25);
		persons[4] = new Person("神七", 38);
		persons[5] = new Person("衫八", 29);

		ArrayList<Person> aList = new ArrayList<Person>();
		System.out.println("原集合：" + aList);

		addArrayToList(persons, aList);
		System.out.println("添加元素后：" + aList);
	}

	public static <T> void addArrayToList(T[] arr, ArrayList<T> aList) {
		for (T t : arr) {
			aList.add(t);
		}
	}
}
