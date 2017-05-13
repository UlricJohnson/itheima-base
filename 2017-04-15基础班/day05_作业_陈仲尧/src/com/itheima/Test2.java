package com.itheima;

import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
 * 
 * (1).键盘录入长方形的长和宽 定义方法计算该长方形的周长,并在main方法中打印周长
 * 
 * (2).键盘录入长方形的长和宽 定义方法计算该长方形的面积,并在main方法中打印面积
 * 
 * (3).键盘录入圆的半径 定义方法计算该圆的周长,并在main方法中打印周长
 * 
 * (4).键盘录入圆的半径 定义方法计算该圆的面积,并在main方法中打印面积
 * 
 * @author Ulric
 *
 */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入长方形的长和宽：");
		double length = scanner.nextDouble();
		double width = scanner.nextDouble();
		System.out.println("长方形的面积为：" + getArea(length, width) + "  周长为：" + getPerimeter(length, width));

		System.out.print("请输入圆的半径：");
		double radius = scanner.nextDouble();
		System.out.println("圆的面积为：" + getArea(radius) + "  周长为：" + getPerimeter(radius));
	}

	// 计算周长
	public static double getPerimeter(double length, double width) {
		return (length + width) * 2;
	}

	public static double getPerimeter(double radius) {
		return 2 * Math.PI * radius;
	}

	// 计算面积
	public static double getArea(double length, double width) {
		return length * width;
	}

	public static double getArea(double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}

}
