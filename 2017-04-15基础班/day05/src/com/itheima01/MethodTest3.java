package com.itheima01;

import java.util.Scanner;

public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = scanner.nextInt();

		System.out.println("请输入第二个数据：");
		int b = scanner.nextInt();

		System.out.println("请输入第三个数据：");
		int c = scanner.nextInt();

		// 调用方法
		int max = getMax(a, b, c);

		// 输出结果
		System.out.println("max:" + max);
	}

	public static int getMax(int a, int b, int c) {
		if (a > b) {
			return a > c ? a : c;
		} else {
			return b > c ? b : c;
		}
	}

}
