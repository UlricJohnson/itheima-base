package com.itheima;

public class Addition2 {
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		demo5();
	}

	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";// 声明变量必然会开辟新内存
		System.out.println(s3 == s2); // true
		System.out.println(s3.equals(s2)); // true
	}

	private static void demo4() {
		// byte b = 3 + 4;
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
	}

	private static void demo3() {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	}

	private static void demo2() {

		String s1 = new String("abc"); // 这句话创建了几个对象 2个
		System.out.println(s1);

	}

	private static void demo1() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
	}
}
