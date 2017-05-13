package com.itheima.operator;

public class OperatorDemo03 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
		System.out.println("-------------");
		
		// 字符参与加法运算
		char c = 'A';
		System.out.println(a + c);
		System.out.println("-------------");
		
		// 字符串参与加法运算
		System.out.println("hello" + a);
		System.out.println("hello" + a + b);
		System.out.println(a + b + "hello");
		
		System.out.println("hello" + 'a');
	}
}
