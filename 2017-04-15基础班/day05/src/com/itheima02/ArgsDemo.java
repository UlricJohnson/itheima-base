package com.itheima02;

/**
 * 基本类型作为参数传递
 * 
 * @author Ulric
 *
 */

public class ArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b); // a:10,b:20
		change(a, b);
		System.out.println("a:" + a + ",b:" + b); // a:10,b:20
	}

	public static void change(int a, int b) {// a=10,b=20
		System.out.println("a:" + a + ",b:" + b); // a:10,b:20
		a = b;
		b = a + b;
		System.out.println("a:" + a + ",b:" + b);// a:20,b:40
	}

}
