package com.itheima.demo2;

import java.util.Scanner;

/**
 * 键盘输入3个数，输出最大值
 * @author Ulric
 *
 */

public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入3个整数：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int temp = a > b ? a : b;
		int max = temp > c ? temp : c;
		System.out.println("the maximum: " + max);
	}
}
