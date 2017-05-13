package com.itheima;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
 * 
 * (1).键盘录入10个整数存入数组中
 * 
 * (2).定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
 * 
 * (3).定义一个方法打印原数组和处理后的数组
 * 
 * (4).定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
 * 
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// (1).键盘录入10个整数存入数组中
		Scanner scanner = new Scanner(System.in);
		System.out.print("请依次输入10个整数:");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		// (2).将奇数放在数组的左侧,偶数放在数组的右侧
		// (3).打印原数组和处理后的数组
		System.out.println("处理数组前：");
		printArr(arr);
		// arr = reorganizeArr1(arr);//#1
		reorganizeArr2(arr);// #2
		System.out.println("处理数组后：");
		printArr(arr);

	}

	// (2)将奇数放在数组的左侧,偶数放在数组的右侧
	// #1(自己想到的) 定义一个新数组，遍历原数组，把奇数放到新数组的左边，偶数放到右边，返回新数组
	public static int[] reorganizeArr1(int[] arr) {
		int[] newArr = new int[arr.length];
		int pointer = 0; // 指向newArr数组，把元素放到该指针指向的位置
		for (int i = 0; i < arr.length; i++) { // 先把所有奇数放到新数组
			if (arr[i] % 2 == 1) {
				newArr[pointer] = arr[i];
				pointer++;
			}
		}
		for (int i = 0; i < arr.length; i++) { // 再把所有偶数放到新数组
			if (arr[i] % 2 == 0) {
				newArr[pointer] = arr[i];
				pointer++;
			}
		}
		return newArr;
	}

	/*
	 * #2 (老师讲的)设置两个指针p1和p2，p1指向第1个元素，p2指向最后一个元素
	 * 
	 * p1向后移动,p2不动，当p1指向的元素为偶数时，判断p2指向的元素是否为奇数，
	 * 
	 * 若是则互换两个元素，否则p2向前移动，p1不动，直到p2指向的元素为奇数，然后进行互换
	 * 
	 * 互换后继续p1向后移动，p2不动，循环操作，循环条件为p1<p2
	 */
	public static void reorganizeArr2(int[] arr) {
		// 两个指针
		int pre = 0;
		int latter = arr.length - 1;
		for (pre = 0; pre < latter; pre++) {// pre指针从0开始往后遍历
			if (arr[pre] % 2 == 0) {// 当pre指向的元素为偶数
				// while (true) {// 循环判断latter指向的元素是否为奇数
				// if (arr[latter] % 2 != 0) {// 如果latter指向的元素为奇数则和pre指向的元素互换
				// int temp = arr[latter];
				// arr[latter] = arr[pre];
				// arr[pre] = temp;
				// latter--;
				// break;// 跳出latter循环
				// }
				// latter--;
				// }
				/*
				 * 用for循环才能控制pre<latter
				 */
				for (; pre < latter; latter--) {
					if (arr[latter] % 2 != 0) {// 如果latter指向的元素为奇数则和pre指向的元素互换
						int temp = arr[latter];
						arr[latter] = arr[pre];
						arr[pre] = temp;
						break;// 跳出latter循环
					}
				}
			}
		}
	}

	// #3

	// (3)打印数组
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
