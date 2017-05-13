package com.itheima.operator;

public class OperatorDemo02 {
	public static void main(String[] args) {
		System.out.println(-5 / 3);
		System.out.println(5 / -3);
		System.out.println(-5 / -3);	// 当除法的操作数都是整数时，除法的结果就是整数
		
		System.out.println(-5 % 3);
		System.out.println(5 % -3);
		System.out.println(-5 % -3);	// 只有当被除数是负数时，余数才是负的
	}
}
