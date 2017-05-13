package com.itheima.demo2;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		System.out.println("您输入的整数为：" + i);
	}
}
