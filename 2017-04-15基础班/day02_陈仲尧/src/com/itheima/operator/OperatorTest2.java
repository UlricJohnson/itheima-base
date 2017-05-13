package com.itheima.operator;

/**
 * 获取3个数中的最大值
 * @author Ulric
 *
 */

public class OperatorTest2 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int temp = (a>b)?a:b;
		int max = (temp > c) ? temp : c;
		System.out.println("max:" + max);
	}
}
