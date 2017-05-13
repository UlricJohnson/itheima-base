package com.itheima;

import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现(分别使用if和switch实现)：                           

     (1).功能描述:键盘录入月份，输出对应的季节

     (2).要求:

           a.键盘录入一个整数(代表月份,范围1-12)

           b.输出该月份对应的季节

                3,4,5春季

                6,7,8夏季

                9,10,11秋季

                12,1,2冬季

           c.演示格式如下:

                        请输入一个月份:3

                        控制台输出:3月份是春季
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 请输入一个月份:");
		byte month = scanner.nextByte();
		
		// #1 if实现
		if (month >= 3 && month <= 5) {
			System.out.println(month + "月份是春季");
		} else if(month >= 6 && month <= 8){
			System.out.println(month + "月份是夏季");
		}else if(month >= 9 && month <= 11){
			System.out.println(month + "月份是秋季");
		}else if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "月份是冬季");
		}else{
			System.out.println("输入非法！");
		}
		
		System.out.println("----------------------");
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "月份是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "月份是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "月份是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月份是冬季");
			break;
		default:
			System.out.println("输入非法！");
			break;
		}
	}

}
