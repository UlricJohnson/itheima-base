package com.itheima02;

/**
 * String trim()------去除字符串两端空格
 * 
 * String[] split(String str)------按照指定符号分割字符串
 * 
 * @author Ulric
 *
 */

public class StringClassDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #1 String trim()
		String str1 = "helloworld";
		String str2 = "  helloworld  ";
		String str3 = "  hello  world  ";
		System.out.println("str1: " + str1);
		System.out.println("str1.trim(): " + str1.trim());
		System.out.println("str2: " + str2);
		System.out.println("str2.trim(): " + str2.trim());
		System.out.println("str3: " + str3);
		System.out.println("str3.trim(): " + str3.trim());
		System.out.println("--------------------------");

		// #2 String[] split(String str)
		// String string = "Ulric.Chan.Johnson";
		String string = "Ulric,Chan,Johnson";
		System.out.println("string: " + string);
		System.out.println("after split: ");
		/*
		 * split()方法不能以英文句号为分割符，因为英文句号在正则表达式中有特殊含义
		 * 
		 * 若一定要用英文句号做分隔符，则需要转义
		 */
		// String[] stringArr = string.split("\\.");
		String[] stringArr = string.split(",");
		System.out.print("[");
		for (int i = 0; i < stringArr.length; i++) {
			if (i == stringArr.length - 1) {
				System.out.println(stringArr[i] + "]");
			} else {
				System.out.print(stringArr[i] + ", ");
			}
		}
	}

}
