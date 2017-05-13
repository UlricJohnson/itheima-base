package com.itheima;

import java.util.Scanner;

/**
 * 数组常见操作(一维数组):
     	从键盘录入7个数，存入到数组中并实现如下需求：
		（1）数组遍历(依次输出数组中的每一个元素)
		（2）数组获取最值(获取数组中的最大值最小值)
    	（3）数组元素逆序输出 (就是把元素对调)
    	（4）数组查表法(根据键盘录入索引,查找数组中对应的数字，并输出)
		（5）数组元素查找(查找指定元素第一次在数组中出现的索引)
 * @author Ulric
 *
 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入7个数：");
		int[] arr = new int[7];
		
		for (int i = 0; i < arr.length; i++) {	// 循环录入数据
			arr[i] = scanner.nextInt();
		}
		
		// (1)数组遍历(依次输出数组中的每一个元素)
		System.out.print("1.输出数组：");
		for (int i = 0; i < arr.length; i++) {
			if(i == 0){						// 数组第一个元素的输出格式
				System.out.print("[" + arr[i] + ", ");
			}else if(i == arr.length - 1){	// 最后一个元素的输出格式
				System.out.println(arr[i]+ "]");
			}else{							// 中间元素的输出格式
				System.out.print(arr[i] + ", ");
			}
		}
		
		//（2）数组获取最值(获取数组中的最大值最小值)
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("2.最大值：" + max + "\t最小值：" + min);
		
    	//（3）数组元素逆序输出 (就是把元素对调)
		System.out.print("3.逆序输出：");
		for (int i = arr.length - 1; i >= 0; i--) {
			if(i == arr.length - 1){						
				System.out.print("[" + arr[i] + ", ");
			}else if(i == 0){	
				System.out.println(arr[i]+ "]");
			}else{							
				System.out.print(arr[i] + ", ");
			}
		}
		
    	//（4）数组查表法(根据键盘录入索引,查找数组中对应的数字，并输出)
		System.out.print("4.请输入索引号(0-6)：");
		int index = scanner.nextInt();
		while(true){
			if(index > arr.length - 1){	// 如果输入的数字大于length-1
				System.out.print("数组越界！\n请重新输入：");
				index = scanner.nextInt();
			}else if(index < 0){		// 如果输入的数字为负数
				System.out.print("非法输入！\n请重新输入：");
				index = scanner.nextInt();
			}else{
				break;
			}
		}
		System.out.println("arr[" + index + "]=" + arr[index]);
		
		//（5）数组元素查找(查找指定元素第一次在数组中出现的索引)
		System.out.print("5.请输入一个整数:");
		int input = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == input){
				System.out.println(input + "在数组arr中第一次出现的索引位置为：" + i);
				break;
			}
			if(i == arr.length - 1){	// 如果遍历完了都没有发现，则输出信息
				System.out.println(input + "不存在于arr数组中！");
			}
		}
	}

}
