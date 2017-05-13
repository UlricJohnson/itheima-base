package com.itheima;

import java.util.Scanner;

/**
 * 4、 分析以下需求，并用代码实现
 * 
 * (1).键盘录入一个大字符串,再录入一个小字符串
 * 
 * (2).统计小字符串在大字符串中出现的次数
 * 
 * (3).代码运行打印格式:
 * 
 * 请输入大字符串:javajavajava I love java l like jajavava I enjoy javajavajava
 * 
 * 请输入小字符串:java
 * 
 * 控制台输出:小字符串java,在大字符串javajavajava I love java l like jajavava I enjoy
 * javajavajava中共出现8次
 * 
 * 提示: 可以借助于String的 String replace(CharSequence target, CharSequence
 * replacement) 或: String的int indexOf(int ch) 和 String substring(int beginIndex)
 * 
 * @author Ulric
 *
 */

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// (1).键盘录入一个大字符串,再录入一个小字符串
		System.out.print("请输入大字符串: ");
		String scrStr = scanner.nextLine();
		System.out.print("请输入小字符串:");
		String subStr = scanner.nextLine();

		// System.out.println("javajavajava I love java l like jajavava I enjoy
		// javajavajava".replace("java", ""));

		System.out.println("小字符串\"" + subStr + "\"在大字符串\"" + scrStr + "\"中共出现" + numOfSubStrs2(scrStr, subStr) + "次");

	}

	// #1 使用String replace(CharSequence target, CharSequence replacement)
	// public static int numOfSubStrs(String scrStr, String subStr) {
	// int count = 0;
	//
	// return count;
	// }

	// #2 使用String的int indexOf(int ch) 和 String substring(int beginIndex)
	public static int numOfSubStrs2(String scrStr, String subStr) {
		int count = 0;
		int index = scrStr.indexOf(subStr);
		while (index != -1) {
			scrStr = scrStr.substring(index + subStr.length());// 要记得加上subStr的长度
			count++;
			index = scrStr.indexOf(subStr);
		}
		return count;
	}
}
