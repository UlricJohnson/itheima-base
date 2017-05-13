package com.itheima03;

import java.util.Scanner;

/**
 * 利用StringBuilder类自定义方法实现反转字符串
 * 
 * @author Ulric
 *
 */

public class StringBuilderTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String string = scanner.nextLine();
		System.out.println("反转前：" + string);
		System.out.println("反转后：" + myReverse(string));
	}

	public static String myReverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
