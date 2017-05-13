package com.itheima;

import java.util.Scanner;

/**
 * 1. 分析以下需求,并用代码实现
 * 
 * (1).键盘录入一个字符串
 * 
 * (2).将该字符串变成字符数组(不能使用toCharArray()方法)
 * 
 * (3).将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
 * 
 * (4).如果第一位和最后一位的内容不相同,则交换
 * 
 * (5).将字符数组中索引为偶数的元素变成'~'
 * 
 * (6).打印数组元素的内容
 * 
 * @author Ulric
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1).键盘录入一个字符串
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String string = scanner.nextLine();

		// (2).将字符串变成字符数组
		char[] chs = strToCharArr(string);

		// (3).将字符数组中的所有大写字母变成小写字母
		chArrToLowerCase(chs);

		// (4).如果第一位和最后一位的内容不相同,则交换
//		print(chs);
		exchange(chs);
//		print(chs);

		// (5).将字符数组中索引为偶数的元素变成'~'
		changeEven(chs);

		// (6).打印数组元素的内容
		print(chs);

	}

	// (2).将字符串变成字符数组
	public static char[] strToCharArr(String str) {
		char[] chs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chs[i] = str.charAt(i);
		}
		return chs;
	}

	// (3).将字符数组中的所有大写字母变成小写字母
	public static void chArrToLowerCase(char[] chs) {
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] > 'A' && chs[i] < 'Z') {
				chs[i] += 32;// 大写字母ASCII码值+32转为小写字母
			}
		}
	}

	// (4).如果第一位和最后一位的内容不相同,则交换
	public static void exchange(char[] chs) {
		if (chs[0] != chs[chs.length - 1]) {
			char temp = chs[0];
			chs[0] = chs[chs.length - 1];
			chs[chs.length - 1] = temp;
		}
	}

	// (5).将字符数组中索引为偶数的元素变成'~'
	public static void changeEven(char[] chs) {
		for (int i = 0; i < chs.length; i += 2) {
			chs[i] = '~';
		}
	}

	// (6).打印数组元素的内容
	public static void print(char[] chs) {
		System.out.print("[");
		for (int i = 0; i < chs.length; i++) {
			if (i == chs.length - 1) {
				System.out.println(chs[i] + "]");
			} else {
				System.out.print(chs[i] + ", ");
			}
		}
	}

}
