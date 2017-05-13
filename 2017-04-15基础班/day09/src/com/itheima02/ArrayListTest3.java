package com.itheima02;

import java.util.ArrayList;

/**
 * ArrayList存储自定义对象并遍历
 * 
 * @author Ulric
 *
 */

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<>();

		arrayList.add(new Student("Megan Fox", 26));
		arrayList.add(new Student("景甜", 24));
		arrayList.add(new Student("柳岩", 29));
		arrayList.add(new Student("林志玲", 40));

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getName() + "----" + arrayList.get(i).getAge());
		}

	}

}
