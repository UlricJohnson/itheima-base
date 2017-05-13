package com.itheima01;

import java.util.Scanner;

/**
 * 评委打分，去除最高分和最低分后计算平均分
 * 
 * @author Ulric
 *
 */

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("请分别输入10个评委的评分(0-10)：");
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("去除最高分和最低分后的平均评分为：" + ((getSum(arr) - getMax(arr) - getMin(arr)) / (arr.length - 2)));

	}

	// 求和
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 求最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// 求最小值
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
