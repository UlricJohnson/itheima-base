package com.itheima.operator;

public class OperatorDemo04 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a:" + a);
		
		int b;
		System.out.println("b:" + (b = ++a));
		System.out.println("a:" + a);
	}
}
