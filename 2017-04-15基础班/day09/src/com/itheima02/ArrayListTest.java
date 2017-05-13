package com.itheima02;

import java.util.ArrayList;

/**
 * 题目:向集合中添加任意四个字符串,遍历集合,依次打印取出的字符串
 * 
 * @author Ulric
 *
 */

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("林志玲");
		arrayList.add("Megan Fox");
		arrayList.add("刘亦菲");
		arrayList.add("郭雪芙");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}

}
