package com.itheima;

import java.util.Scanner;

/**
 * 3、 分析以下需求,并用代码实现
 * 
 * (1).键盘录入一个源字符串由字符串变量scrStr接收
 * 
 * (2).键盘录入一个要删除的字符串由字符串变量delStr接收
 * 
 * (3).要求:删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
 * 
 * (4).代码运行打印格式: 请输入源字符串:java woaijava,i like jajavava i enjoy java
 * 
 * 请输入要删除的字符串:java
 * 
 * 控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like i enjoy
 * 
 * 提示：删除字符串可以借助于String的replaceFirst(String oldStr,String
 * newStr)或StringBuilder的StringBuilder delete(int start, int end) 方法
 * 
 * @author Ulric
 *
 */

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// (1).键盘录入一个源字符串由字符串变量scrStr接收
		System.out.print("请输入源字符串: ");
		String scrStr = scanner.nextLine();

		// (2).键盘录入一个要删除的字符串由字符串变量delStr接收
		System.out.print("请输入要删除的字符串: ");
		String delStr = scanner.nextLine();

		System.out.println("删除\"" + delStr + "\"后的字符串为:" + delSubStr(scrStr, delStr));
	}

	// #1 使用StringBuilder delete(int start, int end) 方法
	public static StringBuilder delSubStr(String scrStr, String delStr) {
		StringBuilder strBuilder = new StringBuilder(scrStr);
		int numOfDelStr = 0;
		int indexOfDelStr = strBuilder.indexOf(delStr);// delStr在scrStr中的索引
		while (indexOfDelStr != -1) {// 只要scrStr字符串中存在delStr子字符串
			strBuilder.delete(indexOfDelStr, indexOfDelStr + delStr.length());
			indexOfDelStr = strBuilder.indexOf(delStr);
			numOfDelStr++;
		}
		System.out.println("源字符串中总共包含:" + numOfDelStr + "个\"" + delStr + "\"");
		return strBuilder;
	}

}
