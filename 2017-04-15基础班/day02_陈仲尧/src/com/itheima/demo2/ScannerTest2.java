package com.itheima.demo2;

import java.util.Scanner;

/**
 * 键盘输入两个数，判断是否相等
 * @author Ulric
 *
 */

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个数：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Equals? " + ((a == b) ? "Yes" : "No"));
	}

}
