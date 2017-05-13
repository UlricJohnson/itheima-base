package com.itheima.operator;

/**
 * 逻辑运算符
 * @author Ulric
 *
 */

public class OperatorDemo07 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		
		// 按位与 &
		System.out.println((a > b) & (a > c));	
		System.out.println((a < b) & (a > c));
		System.out.println((a > b) & (a < c));
		System.out.println((a < b) & (a < c));
		System.out.println("-------------------");
		
		// 按位或 |
		System.out.println((a > b) | (a > c));	
		System.out.println((a < b) | (a > c));
		System.out.println((a > b) | (a < c));
		System.out.println((a < b) | (a < c));
		System.out.println("-------------------");
		
		// 异或 ^
		System.out.println((a > b) ^ (a > c));	
		System.out.println((a < b) ^ (a > c));
		System.out.println((a > b) ^ (a < c));
		System.out.println((a < b) ^ (a < c));
		System.out.println("-------------------");
		
		// 非 !
		System.out.println(a > b);
		System.out.println(!(a > b));
		
	}
}
