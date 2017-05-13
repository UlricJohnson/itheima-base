package com.itheima01;

public class MethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.单独调用
//		sum(10, 20);	// 无意义
		
		// 2.输出调用
		System.out.println(sum(30, 40));
		
		// 3.赋值调用
		int result = sum(50, 60);
		result +=10;	// 可以对返回结果进行操作
		System.out.println(result);
		
	}

	public static int sum(int a, int b) {
		return a + b;
	}

}
