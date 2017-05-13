package com.itheima01;

import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int x = scanner.nextInt();

		System.out.println("请输入第二个数据：");
		int y = scanner.nextInt();

		// 调用方法
		boolean result = compare(x, y);

		// 输出结果
		System.out.println("result:" + result);

	}

	public static boolean compare(int a, int b) {
		return a == b ? true : false;
	}

}
