package com.itheima_01;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入第一个数据：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数据：");
		int b = scanner.nextInt();
		
		if(a > b){
			System.out.println("较大值是：" + a);
		}else{
			System.out.println("较大值是：" + b);
		}
	}
}
