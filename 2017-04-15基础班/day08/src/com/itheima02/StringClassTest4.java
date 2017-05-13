package com.itheima02;

/**
 * 两种方法反转字符串
 * 
 * @author Ulric
 *
 */

public class StringClassTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "HelloWorld";
		System.out.println("原串： " + string);
		System.out.println("---------------------------------");
		System.out.println("length() + charAt() 方法反转字符串： " + stringReverse1(string));
		System.out.println("---------------------------------");
		System.out.println("toCharArray() + String(char[] chs) 方法反转字符串： " + stringReverse2(string));
	}

	// #1 length() + charAt()
	public static String stringReverse1(String str) {
		String string = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			string += str.charAt(i);
		}
		return string;
	}

	// #2 toCharArray() + String(char[] chs)
	public static String stringReverse2(String str) {
		char[] chs = str.toCharArray();
		for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
		}
		return new String(chs);
	}
}
