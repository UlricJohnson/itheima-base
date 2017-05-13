package com.itheima02;

import java.util.ArrayList;

/**
 * 1.获取元素
 * 
 * public E get(int index)`:获取指定索引处的元素
 * 
 * 2.获取元素个数
 * 
 * public int size()`:获取集合中元素个数
 * 
 * 3.删除元素
 * 
 * public boolean remove(Object o)`:删除指定元素，删除成功就返回true，否则返回false
 * 
 * public E remove(int index)`:删除（切取）指定索引处的元素，返回被删除（切取）元素
 * 
 * 4.修改元素
 * 
 * public E set(int index,E element)
 * 
 * 5.判断是否包含某元素
 * 
 * boolean contains(Object o)
 * 
 * @author Ulric
 *
 */

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
		System.out.println("arrayList: " + arrayList);

		// 1.获取元素
		System.out.println("arrayList.get(0): " + arrayList.get(0));
		System.out.println("arrayList.get(1): " + arrayList.get(1));
		System.out.println("arrayList.get(2): " + arrayList.get(2));
		System.out.println("arrayList: " + arrayList);

		// 2.获取元素个数
		System.out.println("arrayList.size(): " + arrayList.size());
		System.out.println("arrayList: " + arrayList);

		// 3.删除元素
		System.out.println("arrayList.remove(\"world\"): " + arrayList.remove("world"));
		System.out.println("arrayList: " + arrayList);
		System.out.println("arrayList.remove(\"world\"): " + arrayList.remove("world"));
		System.out.println("arrayList: " + arrayList);

		System.out.println("arrayList.remove(0): " + arrayList.remove(0));
		System.out.println("arrayList: " + arrayList);

		// 4.修改元素
		System.out.println("arrayList.set(1, \"Android\"): " + arrayList.set(1, "Android"));
		System.out.println("arrayList: " + arrayList);

		// 5.判断是否包含某元素
		System.out.println("arrayList.contains(\"Java\"): " + arrayList.contains("Java"));
		System.out.println("arrayList.contains(\"Love\"): " + arrayList.contains("Love"));
		System.out.println("arrayList: " + arrayList);
	}
}
