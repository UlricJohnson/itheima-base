package com.itheima02;

/**
 * boolean equals(Object obj):
 * 
 * boolean equalsIgnoreCase(String str):
 * 
 * boolean startsWith(String str):
 * 
 * boolean endsWith(String str):
 * 
 * @author Ulric
 *
 */

public class StringClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "Hello";

		// boolean equals(Object obj):
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("------------------");

		// boolean equalsIgnoreCase(String str):
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println("------------------");

		// boolean startsWith(String str):
		System.out.println(str1.startsWith("he"));
		System.out.println(str1.startsWith("ll"));
		System.out.println("http://www.baidu.com".startsWith("http://www."));
		System.out.println("------------------");

		// boolean endsWith(String str):
		System.out.println("≤‘¿œ ¶.png".endsWith(".png"));
	}

}
