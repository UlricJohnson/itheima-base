package com.itheima;

import java.util.Scanner;

/**
 * 1. 键盘录入一个长方形的长和宽 
   要求：
	1. 计算长方形面积。(长*宽)
    2. 计算长方形的周长((长+宽)*2)。
 * @author Ulric
 *
 */

public class Addition1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请依次输入长和宽：");
		int length = scanner.nextInt();
		int width = scanner.nextInt();
		System.out.println("面积：" + length * width + "\n周长：" + (length + width)*2);
	}
}
