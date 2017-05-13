package com.itheima.q1;

import java.util.Random;

/*
 * 1. 获取小于数组中”元素平均数”的元素,要求如下:
 *    1.定义String  getNums(int[] arr)静态方法,方法内要求完成 :获取指定数组arr中所有元素的平均数avg,并打印到控制台,返回元素为大于等于avg 的所有元素(元素间用逗号连接);
 *	  2.定义main方法,方法内完成:
 *       (1)随机获取5个50~89之间(含50,89)整数,存入数组中;
 *       (2)传递arr 调用getNums方法,获取返回值并在控制台打印,要求返回值不以逗号结尾.
 *    参照格式:
 *    平均值为:  71
 *    数组元素有:
 *    68   56    80   75   76
 *    大于等于avg的所有元素分别是80,75,76
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(40) + 50;
		}
		String string = getNums(arr);
		System.out.println("数组元素有：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n大于等于avg的所有元素分别是" + string);
	}

	// 获取指定数组arr中所有元素的平均数avg, 并打印到控制台, 返回元素为大于等于avg 的所有元素(元素间用逗号连接);
	public static String getNums(int[] arr) {
		String string = "";
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.println("平均值为：" + avg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				string += arr[i] + ",";
			}
		}
		return string.substring(0, string.length() - 1);
	}

}
