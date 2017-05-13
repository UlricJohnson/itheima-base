package com.itheima_01;

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) {
		System.out.println("开始");
		
		Scanner scanner = new Scanner(System.in);
		
		// 输入数据
		System.out.print("请输入一个整数：");
		int a = scanner.nextInt();
		
		if(a % 2 == 0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
		
		System.out.println("结束");
	}
}
