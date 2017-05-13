package day06.classTest;

import java.util.Scanner;

/**
 * (1).键盘录入10个int类型的整数,把这10个整数存储到一个int类型的一维数组arr中。
 * 
 * (2).将arr数组中的内容反转
 * 
 * (3).定义一个方法：求该数组中元素的和,并计算出数组中元素为奇数的个数，并打印出来。
 * 
 * 格式为：数组元素的和是100，数组中元素为奇数的个数是3个
 * 
 * (4).定义一个方法：输入一个整数，查看该整数是否在数组中存在。如果不存在，则输出：该整数在数组中不存在。如果存在，则输出该整数在数组中存在的个数。
 * 
 * @author Ulric
 *
 */

public class ClassTest28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// (1).键盘录入10个int类型的整数,把这10个整数存储到一个int类型的一维数组arr中。
		System.out.print("请输入10个整数：");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		// (2).将arr数组中的内容反转
		System.out.print("反转前的数组：");
		printArr(arr);
		reverse(arr);
		System.out.print("反转后的数组：");
		printArr(arr);

		// (3)求该数组中元素的和,并计算出数组中元素为奇数的个数，并打印出来。
		System.out.println("数组元素的和是" + getSum(arr) + ",数组中元素为奇数的个数是" + getNumOfOdd(arr) + "个");

		// (4)输入一个整数，查看该整数是否在数组中存在
		System.out.print("请输入一个整数：");
		int input = scanner.nextInt();
		int count = whetherExist(arr, input);
		if (count > 0) { // 如果存在该整数
			System.out.println("该整数在数组中存在的个数为：" + count);
		} else {
			System.out.println("该整数在数组中不存在");
		}
	}

	// 输出数组
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

	// 反转数组
	public static void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// 数组求和
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 求数组中奇数元素个数
	public static int getNumOfOdd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	// 统计元素在数组中出现的次数,不存在则返回0
	public static int whetherExist(int[] arr, int val) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				count++;
			}
		}
		return count;
	}
}
