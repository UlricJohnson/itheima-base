package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
 * 
 * (1). 分析以下需求，并用代码实现
 * 
 * 1.键盘录入班级人数
 * 
 * 2.根据录入的班级人数创建数组
 * 
 * 3.利用随机数产生0-100的成绩(包含0和100)(封装成方法)
 * 
 * 4.要求:
 * 
 * (1)打印该班级的不及格人数(封装成方法)
 * 
 * (2)打印该班级的平均分(封装成方法)
 * 
 * (3)演示格式如下:
 * 
 * 请输入班级人数:
 * 
 * 键盘录入:100
 * 
 * 控制台输出: 不及格人数:19
 * 
 * 班级平均分:87
 * 
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入班级人数:");

		int numOfStu = scanner.nextInt();
		int[] stuScores = new int[numOfStu]; // 创建数组

		// 循环生成随机成绩
		for (int i = 0; i < stuScores.length; i++) {
			stuScores[i] = getRandomScore();
		}
		
		System.out.println("不及格人数：" + getNumOfFail(stuScores) + "\n班级平均分：" +  getAvrgScore(stuScores, numOfStu));

	}

	// 获取随机成绩
	public static int getRandomScore() {
		Random random = new Random();
		return random.nextInt(101);
	}

	// (1)计算班级的不及格人数(封装成方法)
	public static int getNumOfFail(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 60) {
				count++;
			}
		}
		return count;
	}

	// (2)计算班级的平均分(封装成方法)
	public static double getAvrgScore(int[] scores, int numOfStu) {
		double totalScore = 0.0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return totalScore / numOfStu;
	}

}
