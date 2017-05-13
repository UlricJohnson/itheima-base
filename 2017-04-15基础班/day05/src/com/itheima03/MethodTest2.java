package com.itheima03;

/**
 * 定义方法获取数组中的最大值
 * @author Ulric
 *
 */

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 24, 36, 90, 75, 81 };
		System.out.println("max:" + getMax(arr));
	}
	
	//获取数组中的最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
