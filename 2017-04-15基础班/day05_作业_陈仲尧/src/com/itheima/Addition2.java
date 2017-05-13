package com.itheima;

import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现 数组常见操作(一维数组): 从键盘录入7个数，存入到数组中(封装成方法) 并实现如下需求：
 * （1）数组遍历(依次输出数组中的每一个元素)(封装成方法) （2）数组获取最值(获取数组中的最大值最小值)(封装成方法)
 * （3）数组元素逆序输出(就是把元素对调)(封装成方法) （4）数组查表法(根据键盘录入索引,查找数组中对应的数字，并输出)(封装成方法)
 * （5）数组元素查找(查找指定元素第一次在数组中出现的索引)(封装成方法)
 * 
 * @author Ulric
 *
 */

public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = generateDatas(); // 生成数组

		// （1）数组遍历(依次输出数组中的每一个元素)
		printArray(arr);

		// （2）数组获取最值(获取数组中的最大值最小值)
		printMaxAndMin(arr);

		// （3）数组元素逆序输出(就是把元素对调)
		invertedSequencePrint(arr);

		// （4）数组查表法(根据键盘录入索引,查找数组中对应的数字，并输出)
		System.out.print("(4).请输入索引号(0-6)：");
		int index1 = scanner.nextInt();
		int data = getDataAt(arr, index1);
		while (data == -1) {
			data = getDataAt(arr, index1);
		}
		System.out.println("arr[" + index1 + "]=" + data);

		// （5）数组元素查找(查找指定元素第一次在数组中出现的索引)
		System.out.print("5.请输入一个整数:");
		int input = scanner.nextInt();
		int index2 = getIndexOf(arr, input);
		if (index2 == -1) {
			System.out.println(input + "不存在于该数组中！");
		} else {
			System.out.println(input + "在数组arr中第一次出现的索引位置为：" + index2);
		}
	}

	// 从键盘录入7个数，存入到数组中(封装成方法)
	public static int[] generateDatas() {
		System.out.print("请输入7个整数：");
		Scanner scanner = new Scanner(System.in);
		int[] datas = new int[7];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = scanner.nextInt();
		}
		return datas;
	}

	// （1）数组遍历(依次输出数组中的每一个元素)(封装成方法)
	public static void printArray(int[] arr) {
		System.out.print("(1).输出数组：");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) { // 数组第一个元素的输出格式
				System.out.print("[" + arr[i] + ", ");
			} else if (i == arr.length - 1) { // 最后一个元素的输出格式
				System.out.println(arr[i] + "]");
			} else { // 中间元素的输出格式
				System.out.print(arr[i] + ", ");
			}
		}
	}

	// （2）数组获取最值(获取数组中的最大值最小值)(封装成方法)
	public static void printMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("(2).最大值：" + max + "\t最小值：" + min);
	}

	// （3）数组元素逆序输出(就是把元素对调)(封装成方法)
	public static void invertedSequencePrint(int[] arr) {
		System.out.print("(3).逆序输出：");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == arr.length - 1) {
				System.out.print("[" + arr[i] + ", ");
			} else if (i == 0) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	// （4）数组查表法(根据键盘录入索引,查找数组中对应的数字，并输出)(封装成方法)
	public static int getDataAt(int[] arr, int index) {
		if (index > arr.length - 1) {
			System.out.print("数组越界！\n请重新输入：");
			return -1;
		} else if (index < 0) {
			System.out.print("非法输入！\n请重新输入：");
			return -1;
		} else {
			return arr[index];
		}

	}

	// （5）数组元素查找(查找指定元素第一次在数组中出现的索引)(封装成方法)
	public static int getIndexOf(int[] arr, int input) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				return i;
			}
		}
		return -1;

	}

}
