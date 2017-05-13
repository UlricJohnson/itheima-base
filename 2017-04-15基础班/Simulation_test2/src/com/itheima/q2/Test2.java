package com.itheima.q2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 写一个测试类Test,创建集合,并把对象初始化为:
 * 		Tom,2
 * 		加菲,5
 *  	小蓝,8
 * 	Test类内有删除方法   delCat(ArrayList<User>list,int n)
 * 	键盘录入一个整数,要求删除小于这个整数的年龄对应的猫,最后打印剩余猫所有属性信息.
 */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cat> arrayList = new ArrayList<>();

		arrayList.add(new Cat("Tom", 2));
		arrayList.add(new Cat("加菲", 5));
		arrayList.add(new Cat("小蓝", 8));

		System.out.println("请输入一个整数:");
		delCat(arrayList, new Scanner(System.in).nextInt());

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getName() + "--" + arrayList.get(i).getAge());
		}
	}

	public static void delCat(ArrayList<Cat> list, int n) {
		for (int i = 0; i < list.size(); i++) {
			Cat cat = list.get(i);
			if (cat.getAge() < n) {
				list.remove(cat);
				i--;
			}
		}

	}

}
