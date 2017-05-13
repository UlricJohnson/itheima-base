package com.itheima;

import java.util.Scanner;

/**
 * 1. 分析以下需求，并用代码实现：
 * 
 * (1)从键盘录入一个字符串
 * 
 * (2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
 * 
 * 举例: 键盘录入：Hello12345World
 * 
 * 输出结果：hELLO*****wORLD 总共10个字母
 * 
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String string = scanner.nextLine();

		String newStr = "";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isUpperCase(ch)) {// 如果为大写字母就转为小写
				newStr += (char) (ch + 32);
				count++;
			} else if (Character.isLowerCase(ch)) {// 如果为小写字母就转为大写
				newStr += (char) (ch - 32);
				count++;
			} else {// 否则加一个"*"到newStr中
				newStr += "*";
			}
		}
		System.out.println(newStr + "总共" + count + "个字母");
	}

	// #1 StringBuilder
//	public static int changeAndCount(StringBuilder stringBuilder) {
//		// StringBuilder stringBuilder = new
//		// StringBuilder(stringBuilder.toString());
//		String strData = stringBuilder.toString();
//		int count = 0;
//		for (int i = 0; i < strData.length(); i++) {
//			char ch = strData.charAt(i);
//			if (Character.isUpperCase(ch)) {// 如果为大写字母就转为小写之后加到stringBuilder中
//				stringBuilder.append(ch + 32);
//				count++;
//			} else if (Character.isLowerCase(ch)) {// 如果为小写字母就转为大写
//				stringBuilder.append(ch - 32);
//				count++;
//			} else {// 否则加一个"*"到stringBuilder中
//				stringBuilder.append("*");
//			}
//		}
//		// str = stringBuilder.toString();
//		return count;
//	}

	// #2 String
	// public static int changeAndCount(String str){
	// int count = 0;
	// for (int i = 0; i < str.length(); i++) {
	//
	// }
	// return count;
	//
	// }

}
