package com.itheima;

import java.util.Scanner;

/**
 * (1).功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果

     (2).要求：

               a.键盘录入三个整数,其中前两个整数代表参加运算的数据，

                        第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)

               b.使用今天所学知识完成功能

               c.演示格式如下:

                        请输入第一个整数:30

                        请输入第二个整数:40

                        请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0

                        控制台输出:30+40=70
 * @author Ulric
 *
 */

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入第一个整数：");
		int num1 = scanner.nextInt();
		
		System.out.print("请输入第二个整数：");
		int num2 = scanner.nextInt();
		
		System.out.print("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
		int operationInt = scanner.nextInt();
		
		switch (operationInt) {
		case 0:
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case 1:
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case 2:
			System.out.println(num1 + "×" + num2 + "=" + (num1 * num2));
			break;
		case 3:
			System.out.println(num1 + "÷" + num2 + "=" + (num1 * 0.1 / num2));
			break;
		default:
			break;
		}
	}

}
