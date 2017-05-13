package com.itheima02;

/**
 * 4种方式创建字符串对象
 * 
 * @author Ulric
 *
 */

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #1 String(String original)
		String str1 = new String("String1");
		System.out.println("str1: " + str1);
		System.out.println("-----------");

		// #2 String(char[] value)
		char[] chs1 = { 's', 't', 'r', 'i', 'n', 'g', '2' };
		String str2 = new String(chs1);
		System.out.println("str2: " + str2);
		System.out.println("------------");

		// #3 String(char[] value, int offset, int count)
		char[] chs2 = { 'S', 'T', 'R', 'I', 'N', 'G', '3' };
		String str3 = new String(chs2, 0, 4);
		System.out.println("str3: " + str3);
		System.out.println("------------");

		// #4 "" 字符串字面量
		String str4 = "string4";
		System.out.println("str4: " + str4);
	}

}
