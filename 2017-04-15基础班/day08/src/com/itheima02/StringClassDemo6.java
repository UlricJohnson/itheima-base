package com.itheima02;

/**
 * 字符串的转换功能
 * 
 * char[] toCharArray()
 * 
 * String toLowerCase()
 * 
 * String toUpperCase()
 * 
 * @author Ulric
 *
 */

public class StringClassDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "HelloWorld123$%^";
		// #1 char[] toCharArray()
		char[] chs = string.toCharArray();
		System.out.print("[");
		for (int i = 0; i < chs.length; i++) {
			if (i == chs.length - 1) {
				System.out.println(chs[i] + "]");
			} else {
				System.out.print(chs[i] + ", ");
			}
		}
		System.out.println("----------------");

		// #2 String toLowerCase()
		System.out.println(string.toLowerCase());
		System.out.println("-----------------");

		// #3 String toUpperCase()
		System.out.println(string.toUpperCase());
		System.out.println("-----------------");

	}

}
