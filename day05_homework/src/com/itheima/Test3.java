package com.itheima;

public class Test3 {

	public static void main(String[] args) {
		processCharAt(null, 2);
		System.out.println("-------------------");

		processCharAt("", 1);
		System.out.println("-------------------");

		processCharAt("rgjc", 5);
		System.out.println("-------------------");

		processCharAt("aekzcd", 3);
		System.out.println("-------------------");
	}

	public static void processCharAt(String str, int index) {
		// char ch = '\u0000';//空字符具有换行功能
		try {
			// ch = charAt(str, index);
			System.out.println(charAt(str, index));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// System.out.println(ch);
	}

	public static char charAt(String str, int index) throws Exception {
		if (str == null) {
			throw new Exception("字符串不能为null");
		} else if (str.isEmpty()) {
			throw new Exception("字符串不能为空");
		} else if (index < 0 || index >= str.length()) {
			throw new Exception("索引越界");
		}
		return str.charAt(index);
	}

}