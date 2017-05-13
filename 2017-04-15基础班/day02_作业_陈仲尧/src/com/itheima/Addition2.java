package com.itheima;

import java.util.Scanner;

/**
 * 2. 键盘录入圆形的半径
   要求：
    1. 计算圆形的周长(2πr)
	2. 计算圆形的面积(πr的平方)。
 * @author Ulric
 *
 */

public class Addition2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入半径：");
		double r = scanner.nextDouble();
		System.out.println("周长：" + 2 * Math.PI * r + "\n面积：" + Math.PI * r * r);
	}
}
