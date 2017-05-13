package com.itheima_02;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//定义一个数组
		int[] arr = new int[3];
		
		//赋值
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		//输出
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//然后定义第二个数组的时候吧第一个数组的地址值赋给第二个数组
		int[] arr2 = arr;
		
		// 给第二个数组赋值
		arr2[0] = 111;
		arr2[1] = 222;
		arr2[2] = 333;
		
		// 再次输出两个数组名及其元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
	}

}
