package com.itheima_02;

/**
 * 数组获取最大值
 * @author Ulric
 *
 */

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义数组
		int[] arr = {12, 45, 67, 15, 38};
		
		// 定义参照物
		int max = arr[0];
		
		// 遍历数组，获取除了0索引之外的元素进行比较
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		// 输出max
		System.out.println("max: " + max);
	}

}
