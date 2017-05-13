package com.itheima02;

/**
 * char charAt(int index)±éÀú×Ö·û´®
 * 
 * @author Ulric
 *
 */

public class StringClassDemo4 {
	public static void main(String[] args) {
		String str = "HelloWorld";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
}
