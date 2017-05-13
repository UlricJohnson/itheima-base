package com.itheima03;

/**
 * StringBuilder和String的相互转换
 * 
 * @author Ulric
 *
 */

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuilder-->String
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello").append("World");

		System.out.println("stringBuilder.toString(): " + stringBuilder.toString());

		// String-->StringBuilder
		String string = "HelloWorld";
		System.out.println("new StringBuilder(string): " + new StringBuilder(string));
	}

}
