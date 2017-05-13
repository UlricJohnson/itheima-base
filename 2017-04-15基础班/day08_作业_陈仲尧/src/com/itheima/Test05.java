package com.itheima;

import java.util.Random;

/**
 * 5、 分析以下需求,并用代码实现
 * 
 * (1).定义String getStr(char[] chs)方法
 * 
 * 功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
 * 
 * (2).定义main方法，方法内完成：
 * 
 * a.定义长度为26，元素值为26个大写英文字母的数组chs
 * 
 * b.传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值
 * 
 * @author Ulric
 *
 */

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a.定义长度为26，元素值为26个大写英文字母的数组chs
		char[] chs = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		System.out.println(getStr(chs));
	}

	public static String getStr(char[] chs) {
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		// int randInt = random.nextInt(10);// 随机获取0-9
		for (int i = 0; i < 4; i++) {// 随机从chs数组中取出4个元素压进stringBuilder中
			stringBuilder.append(chs[random.nextInt(chs.length)]);
		}
		stringBuilder.append(random.nextInt(10));// 随机产生0-9追加到stringBuilder中
		return stringBuilder.toString();
	}
}
