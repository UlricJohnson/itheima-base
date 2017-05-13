package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
 * 
 * 1.基础班考试要进行分组,键盘录入该班级总共多少组?以及每组的学生数量?
 * 
 * 2.根据录入的组数及每组学员的数量创建二维数组
 * 
 * 3.利用随机数产生0-100的成绩(包含0和100)(封装成方法)
 * 
 * 4.要求:
 * 
 * (1)打印该班级中每组的不及格人数(封装成方法)
 * 
 * (2)打印该班级中每组的平均分(封装成方法)
 * 
 * (3)打印组的最高平均分 (封装成方法)
 * 
 * (4)演示格式如下:
 * 
 * 请输入班级总组数:3
 * 
 * 请输入班级中每组的人数:10
 * 
 * 控制台输出:
 * 
 * 第1组不及格人数为: 6 人
 * 
 * 第2组不及格人数为: 7 人
 * 
 * 第3组不及格人数为: 3 人
 * 
 * 第1组平均分为: 52
 * 
 * 第2组平均分为: 46
 * 
 * 第3组平均分为: 69
 * 
 * 班级中单组最高平均分为:69
 * 
 * @author Ulric
 *
 */

public class Addition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入班级总组数:");
		int row = scanner.nextInt();
		System.out.print("请输入班级中每组的人数:");
		int col = scanner.nextInt();
		int[][] stus = new int[row][col]; // 创建数组
		
		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus[i].length; j++) {
				stus[i][j]=getRandomScore();
			}
		}

		// (1)打印该班级中每组的不及格人数
		printFailsOfEachGroup(stus);

		// (2)打印该班级中每组的平均分
		printAvrgScoreOfEachGroup(stus);

		// (3)打印组的最高平均分
		System.out.println("班级中单组最高平均分为:" + getHighestAvrgScore(stus));
	}

	// 利用随机数产生0-100的成绩(包含0和100)(封装成方法)
	public static int getRandomScore() {
		Random random = new Random();
		return random.nextInt(101);
	}

	// (1)打印该班级中每组的不及格人数(封装成方法)
	public static void printFailsOfEachGroup(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0; // 统计不及格人数
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 60) {
					count++;
				}
			}
			System.out.println("第" + (i + 1) + "组中不及格人数为:" + count + "人");
		}
	}

	// (2)打印该班级中每组的平均分(封装成方法)
	public static void printAvrgScoreOfEachGroup(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // 累计总分数
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("第" + (i + 1) + "组平均分为: " + (sum * 1.0) / arr[i].length);
		}
	}

	// (3)打印组的最高平均分 (封装成方法)
	public static double getHighestAvrgScore(int[][] arr) {
		double highestAvrgScore = 0; // 存放最高平均分
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // 累计总分数
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if ((sum * 1.0) / arr[i].length > highestAvrgScore) {// 如果当前组的平均分高于最高组平均分
				highestAvrgScore = (sum * 1.0) / arr[i].length;
			}
		}
		return highestAvrgScore;
	}
}
