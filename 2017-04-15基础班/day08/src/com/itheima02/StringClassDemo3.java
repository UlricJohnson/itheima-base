package com.itheima02;

/**
 * String类的获取功能
 * 
 * int length()
 * 
 * char charAt(int index)
 * 
 * int indexOf(String str)
 * 
 * String substring(int start)
 * 
 * String substring(int start,int end)
 * 
 * @author Ulric
 *
 */

public class StringClassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld";
		System.out.println(str);
		System.out.println("-------------------------------------");

		// #1 int length()
		System.out.println("str.length(): " + str.length());
		System.out.println("-------------------------------------");

		// #2 char charAt(int index)
		System.out.println("str.charAt(int index): " + str.charAt(3));
		System.out.println("-------------------------------------");

		// #3 int indexOf(String str)
		System.out.println("str.indexOf(String str): " + str.indexOf("l"));
		System.out.println("str.indexOf(String str): " + str.indexOf("owo"));
		System.out.println("-------------------------------------");

		// #4 String substring(int start)
		System.out.println("str.substring(int start): " + str.substring(0));
		System.out.println("str.substring(int start): " + str.substring(5));
		System.out.println("-------------------------------------");

		// #5 String substring(int start,int end)
		System.out.println("str.substring(int start,int end): " + str.substring(0, str.length()));
		System.out.println("str.substring(int start,int end): " + str.substring(1, 9));
		System.out.println("-------------------------------------");
	}

}
