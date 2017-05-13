package com.itheima;

import java.util.Random;

/**
 * 3. 获取小于数组中”元素平均数”的元素,要求如下:
 * 
 * 1.定义String getNums(int[] arr)静态方法,方法内要求完成 :
 * 
 * 获取指定数组arr中所有元素的平均数avg,并打印到控制台, 返回元素为小于等于avg 的所有元素(元素间用逗号连接);
 * 
 * 2.定义main方法,方法内完成:
 * 
 * (1)随机获取6个1~89之间(含1,89)整数,存入数组中;
 * 
 * (2)传递arr调用getNums方法,获取返回值并在控制台打印,要求返回值不以逗号结尾.
 * 
 * 参照格式: 平均值为: 62 数组元素有: 1 29 68 95 93 88
 * 
 * 小于等于avg的所有元素分别是1,29
 * 
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		// (1)随机获取6个1~89之间(含1,89)整数,存入数组中;
		int[] arr = new int[6];
		System.out.print("数组元素有：");
		for (int i = 0; i < arr.length; i++) {//
			arr[i] = random.nextInt(89) + 1;
			System.out.print(arr[i] + " ");
		}

		// (2)传递arr调用getNums方法,获取返回值并在控制台打印,要求返回值不以逗号结尾.
		System.out.println("小于等于avg的所有元素分别是" + getNums(arr));

	}

	// 获取指定数组arr中所有元素的平均数avg,并打印到控制台, 返回元素为小于等于avg 的所有元素(元素间用逗号连接);
	public static String getNums(int[] arr) {
		// int avg;
		int sum = 0;
		String string = "";
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("平均值为：" + avg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) {
				string += (arr[i] + ",");
			}
		}
		System.out.println(string);
		return string.substring(0, string.length() - 1);// 去除最后一个逗号之后返回
	}

}
