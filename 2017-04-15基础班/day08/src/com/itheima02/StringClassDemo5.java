package com.itheima02;

import java.util.Scanner;

/**
 * 统计字符串中大、小写字母字符和数字字符的个数
 * 
 * @author Ulric
 *
 */

public class StringClassDemo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// String string = "HelloWorld123";

		System.out.println("请输入一个字符串：");
		String string = scanner.nextLine();

		// #1 利用Character类判断
		System.out.println("\n#1 利用Character类判断");
		int numOfDigit1 = 0;
		int numOfUpperCase1 = 0;
		int numOfLowerCase1 = 0;
		int otherChar1 = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {// 如果是数字字符
				numOfDigit1++;
			} else if (Character.isUpperCase(string.charAt(i))) {// 如果是大写字母字符
				numOfUpperCase1++;
			} else if (Character.isLowerCase(string.charAt(i))) {// 如果是小写字母字符
				numOfLowerCase1++;
			} else {
				otherChar1++;
			}
		}
		System.out.println("大写字母字符个数：" + numOfUpperCase1 + "\n小写字母字符个数：" + numOfLowerCase1 + "\n数字字符个数：" + numOfDigit1
				+ "\n其它字符个数：" + otherChar1);
		System.out.println("--------------------------");

		// #2 利用ASCII码表判断
		System.out.println("#2 利用ASCII码表判断");
		int numOfDigit2 = 0;
		int numOfUpperCase2 = 0;
		int numOfLowerCase2 = 0;
		int otherChar2 = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch > '0' && ch < '9') {// 如果是数字字符
				numOfDigit2++;
			} else if (ch > 'A' && ch < 'Z') {// 如果是大写字母字符
				numOfUpperCase2++;
			} else if (ch > 'a' && ch < 'z') {// 如果是小写字母字符
				numOfLowerCase2++;
			} else {
				otherChar2++;
			}
		}
		System.out.println("大写字母字符个数：" + numOfUpperCase2 + "\n小写字母字符个数：" + numOfLowerCase2 + "\n数字字符个数：" + numOfDigit2
				+ "\n其它字符个数：" + otherChar2);
	}
}
