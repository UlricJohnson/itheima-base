package com.itheima02;

import java.util.ArrayList;

/**
 * 集合类
 * 
 * 添加元素
 * 
 * @author Ulric
 *
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("list: " + list);// 输出的不是地址

		// add(E e)添加元素
		list.add("Hello");
		list.add("World");

		// add(int index, E e)添加元素
		list.add(1, "Java");

		System.out.println("list: " + list);
	}
}
