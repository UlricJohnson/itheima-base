package com.itheima03;

/**
 * 定义函数对数组求和
 * 
 * @author Ulric
 *
 */

public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("sum:" + sum(arr));
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
