package com.itheima01;

import java.util.Scanner;

/**
 * 反转数组
 * 
 * @author Ulric
 *
 */

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数组元素个数：");
		int numOfEles = scanner.nextInt();
		int[] arr = new int[numOfEles];

		System.out.println("请依次输入" + numOfEles + "个元素");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.print("反转数组前：");
		printArr(arr);

		reverse(arr);

		System.out.print("反转数组后：");
		printArr(arr);

	}

	// 反转数组
	public static void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// 输出数组
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
