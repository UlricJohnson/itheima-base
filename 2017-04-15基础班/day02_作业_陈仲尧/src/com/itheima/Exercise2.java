package com.itheima;

import java.util.Scanner;

/**
 * 2、分析以下需求，并用代码实现

         (1).键盘录入三个int类型的数字

         (2).要求：

                   a.求出三个数中的最小值并打印

                   b.求出三个数的和并打印
 * @author Ulric
 *
 */

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入3个int类型的数字: ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int temp = a < b ? a : b;		// 求最小值
		int min = temp < c ? temp : c;
		
		System.out.println("最小值为：" + min + "\n和为：" + (a+b+c));
	}
}
