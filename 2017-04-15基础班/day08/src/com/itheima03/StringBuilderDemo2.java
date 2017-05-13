package com.itheima03;

/**
 * StringBuilder的添加功能和反转功能
 * 
 * public StringBuilder append(任意类型)
 * 
 * public StringBuilder reverse()
 * 
 * @author Ulric
 *
 */

public class StringBuilderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();

		// #1 public StringBuilder append(任意类型)
		stringBuilder.append("Hello").append("World").append(true).append(123);
		System.out.println("stringBuilder: " + stringBuilder);
		System.out.println("--------------------------------------");

		// #2 public StringBuilder reverse()
		System.out.println("stringBuilder.reverse(): " + stringBuilder.reverse());
	}

}
