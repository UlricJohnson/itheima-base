package com.itheima01;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * 返回查找元素在数组中的索引
 * 
 * @author Ulric
 *
 */

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 7, 3, 2, 5 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入要查询的数据：");
		int index = getIndex(arr, scanner.nextInt());
		if (index == -1) {
			System.out.println("查找失败！");
		} else {
			System.out.println("index:" + index);
		}
	}

	// 获取元素在数组中的索引，查找失败返回-1
	public static int getIndex(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
