package com.itheima02;

/**
 * char数组转为String类型
 * 
 * @author Ulric
 *
 */

public class StringClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] chars = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
		System.out.println("arrToString(chars): " + arrToString(chars));
	}

	public static String arrToString(char[] chs) {
		// #1 课堂
		// String string = "[";
		// for (int i = 0; i < chs.length; i++) {
		// if (i == chs.length - 1) {
		// string += chs[i];
		// string += "]";
		// } else {
		// string += chs[i];
		// string += ", ";
		// }
		// }
		// return string;

		// #2 自己写
		String str = "";
		for (int i = 0; i < chs.length; i++) {
			str += chs[i];
		}
		return str;

	}

}
