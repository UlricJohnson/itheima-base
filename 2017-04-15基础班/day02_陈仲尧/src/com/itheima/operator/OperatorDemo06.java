package com.itheima.operator;

/**
 * ±È½ÏÔËËã·û
 * @author Ulric
 *
 */

public class OperatorDemo06 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 10;
		
		System.out.println("a == b:" + (a == b));
		System.out.println("a == c" + (a == c));
		System.out.println("--------------");
		
		System.out.println("a != b" + (a != b));
		System.out.println("a != c" + (a != c));
		System.out.println("--------------");
		
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("--------------");
		
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("--------------");
	}
}
