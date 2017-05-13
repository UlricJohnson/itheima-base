package com.itheima01;

/**
 * 1.定义一个int类型的一维数组，内容为{171, 72, 19, 16, 118, 51, 210, 7, 18}
 * 
 * 2.求出该数组中满足要求的元素和
 * 
 * 要求：求和的元素的个位和十位不能包含7，且只能为偶数
 * 
 * @author Ulric
 *
 */

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 171, 72, 19, 16, 118, 51, 210, 7, 18 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 10 != 7) && (arr[i] / 10 % 10 != 7) && (arr[i] % 2 == 0)) {
				sum += arr[i];
			}
		}

		System.out.println("sum:" + sum);
	}

}
