package com.itheima02;

/**
 * ±éÀú¼¯ºÏ
 * 
 * @author Ulric
 */

import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
