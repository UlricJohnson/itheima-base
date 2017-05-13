package com.itheima03;

/**
 * 利用StringBuilder把数组拼接成一个字符串
 * 
 * @author Ulric
 *
 */

public class StringBuilderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String arrToString(int[] arr) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			stringBuilder.append(arr[i]);
		}
		return stringBuilder.toString();
	}

}
