package com.itheima02;

/**
 * 将字符串中首字母大写，其余小写
 * 
 * @author Ulric
 *
 */

public class StringClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hello, CJ-McColumn 684#%^*";

		String firstLetter = string.substring(0, 1);
		String remainder = string.substring(1);

		System.out.println("转换后：" + firstLetter.toUpperCase() + remainder.toLowerCase());
	}

}
