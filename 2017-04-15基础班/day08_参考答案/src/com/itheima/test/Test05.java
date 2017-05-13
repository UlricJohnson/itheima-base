package com.itheima.test;

import java.util.Random;

public class Test05 {
	/*
	 * 
		第5题: 分析以下需求,并用代码实现
		1.定义String getStr(char[] chs)方法
			功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
		2.定义main方法，方法内完成：
			(1)定义长度为26，元素值为26个大写英文字母的数组chs
			(2)传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值
	 */
	public static void main(String[] args) {
		//定义长度为26，元素值为26个大写英文字母的数组chs
		char[] arr = new char[26];
		//定义数组索引变量
		int index = 0;
		//遍历大写字母范围。
		for(int i = 'A'; i <= 'Z';i++) {
			//将字母存储数组中
			arr[index] = (char) i;
			index++;
		}
		
		//调用getStr方法，返回一个长度为5的随机字符串。包含4个大写字母和1个0-9之间的数字
//		String str = getStr(arr);
		String str = getStr2(arr);
		System.out.println(str);
	}

	/*
	 *方式1: 获取字符串方法
	 */
	public static String getStr(char[] arr) {
		//定义要生成的字符串
		String line = "";
		//创建生成随机数对象
		Random r = new Random();
		//生成4个随机数，范围在数组长度以内
		for(int i = 1; i < 5; i ++) {
//			数组索引的范围 0-arr.length-1
//			随机数生成0-arr.length(不包含);
			int num = r.nextInt(arr.length);
			line += arr[num];
		}
		//生成1个数字
		line += r.nextInt(10);
		//将字符串返回
		return line;
	}
	
	/*
	 * 方式2: 获取字符串方法
	 */
	public static String getStr2(char[] arr) {
		//定义要生成的字符串
		StringBuilder sb = new StringBuilder();
		//创建生成随机数对象
		Random r = new Random();
		
		//生成4个随机数，范围在数组长度以内
		for(int i = 1; i < 5; i ++) {
			int num = r.nextInt(arr.length);
			sb.append(arr[num]);
		}
		//生成1个数字
		int rd = r.nextInt(10);
		//将字符串返回
		sb.append(rd);
		
//		ABCD 5
//		如果插入的数字也要随机位置话,可以碎一个字符串的索引
//		int rdIndex = r.nextInt(sb.length())+1;
//		sb.insert(rdIndex, rd);
		return sb.toString();
	}
	
	
	
}
