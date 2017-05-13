package com.itheima01;

/**
 * 写一个方法，传递一个大于0的整数，从1开始打印一直到该值
 * 
 * @author Ulric
 *
 */

public class MethodTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(15);
	}

	public static void printNumber(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1);
		}
	}

}
