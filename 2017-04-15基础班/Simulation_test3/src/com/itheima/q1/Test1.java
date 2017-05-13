package com.itheima.q1;

import java.util.Random;

/*
 * 1. 求平均分 ,要求如下:
 *  1) 定义int  getAvgScore(int[] arr)静态方法,方法内完成:获取指定arr数组中分数的平均值
 *  2) 定义main方法内完成:
 *		1. 定义一个长度为5的int数组arr
 * 		2. 生成5个0-100的随机数,存入数组
 *		3. 传递arr调用getAvgScore(int[] arr)方法,获取方法返回值并在控制台输出打印该返回值
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
		}

		System.out.println("平均值为：" + getAvgScore(arr));
	}

	public static int getAvgScore(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

}
