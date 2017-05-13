package com.itheima.q1;

import java.util.Scanner;

/*
 * 1. 键盘录入一个整数n,写一个方法获取1-n(包含1和n)之间5的倍数的累加和
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个正整数n：");
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("1-" + n + "之间5的倍数的累加和为" + sum);
	}

}
