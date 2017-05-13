package com.itheima01;

/**
 * 不死神兔问题
 * 
 * @author Ulric
 *
 */

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];

		//
		arr[0] = arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		System.out.println("第20个月后兔子的对数是：" + arr[19]);
	}

	// 用数组
	public static int getRabbit(int month) {
		int[] arr = new int[month];
		arr[0] = arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[month - 1];
	}

}
