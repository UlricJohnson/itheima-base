package com.itheima03;

import java.util.Scanner;

/**
 * 判断一个字符串是否对称
 * 
 * @author Ulric
 *
 */

public class StringBuilderTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入一个字符串：");
		String string = scanner.nextLine();
		System.out.println("是否对称？" + isSymmetrical(string));
	}

	public static boolean isSymmetrical(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}

}
