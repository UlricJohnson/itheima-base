package com.itheima;

import java.util.Scanner;

/**
 * (1).根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入

     (2).涨工资的条件如下：

               [10-15)     +5000

               [5-10)      +2500

               [3~5)       +1000

               [1~3)       +500

               [0~1)       +200

     (3).如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
 * @author Ulric
 *
 */

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int lengthOfService;	// 工龄
		double basePay;		// 基本工资
		
		while(true){	// 保证工龄为正数
			System.out.print("请输入您的工龄(整数):");
			lengthOfService = scanner.nextInt();
			if(lengthOfService >= 0){
				break;
			}
			System.out.println("请输入正整数！");
		}
		
		while(true){	 // 保证基本工资为正数
			System.out.print("请输入您的基本工资：");
			basePay = scanner.nextDouble();
			if(basePay >= 0){
				break;
			}
			System.out.println("请输入正整数！");
		}
		
		if(lengthOfService >= 0 && lengthOfService < 1){
			System.out.println("您目前工作了" + lengthOfService + "年，基本工资为" + basePay + "元, 应涨工资 200元,涨后工资" + (basePay + 200) + "元");
		}else if(lengthOfService >= 1 && lengthOfService < 3){
			System.out.println("您目前工作了" + lengthOfService + "年，基本工资为" + basePay + "元, 应涨工资 500元,涨后工资" + (basePay + 500) + "元");
		}else if(lengthOfService >= 3 && lengthOfService < 5){
			System.out.println("您目前工作了" + lengthOfService + "年，基本工资为" + basePay + "元, 应涨工资 1000元,涨后工资" + (basePay + 1000) + "元");
		}else if(lengthOfService >= 5 && lengthOfService < 10){
			System.out.println("您目前工作了" + lengthOfService + "年，基本工资为" + basePay + "元, 应涨工资 2500元,涨后工资" + (basePay + 2500) + "元");
		}else if(lengthOfService >= 10 && lengthOfService < 15){
			System.out.println("您目前工作了" + lengthOfService + "年，基本工资为" + basePay + "元, 应涨工资 5000元,涨后工资" + (basePay + 5000) + "元");
		}else if(lengthOfService >= 15){
			System.out.println("兄弟！请直接联系老总，升多少随便你！");
		}
	}

}
