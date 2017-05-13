package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现 (1). 分析以下需求，并用代码实现
 * 
 * 1.基础班考试要进行分组,键盘录入该班级总共多少组?以及每组的学生数量?
 * 
 * 2.根据录入的组数及每组学员的数量创建二维数组
 * 
 * 3.利用随机数产生0-100的成绩(包含0和100)(封装成方法)
 * 
 * 4.要求:
 * 
 * (1)打印班级中的不及格人数(封装成方法)
 * 
 * (2)打印班级平均分(封装成方法)
 * 
 * (3)演示格式如下:
 * 
 * 请输入班级总组数:3
 * 
 * 请输入班级中每组的人数:10
 * 
 * 控制台输出:
 * 
 * 班级中不及格人数为: 16 人
 * 
 * 班级总平均分为: 56
 * 
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入班级总组数:");
		int row = scanner.nextInt();
		System.out.print("请输入班级中每组的人数:");
		int col = scanner.nextInt();
		int[][] stus = new int[row][col]; // 创建数组

		// 生成成绩
		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus[i].length; j++) {
				stus[i][j] = getRandomScore();
			}

		}

		// (1)打印班级中的不及格人数
		System.out.println("班级中不及格人数为: " + numOfFail(stus));

		// (2)打印班级平均分
		System.out.println("班级平均分为：" + getAvrgScore(stus));
	}

	// 利用随机数产生0-100的成绩(包含0和100)(封装成方法)
	public static int getRandomScore() {
		Random random = new Random();
		return random.nextInt(101);
	}

	// (1)统计班级中的不及格人数(封装成方法)
	public static int numOfFail(int[][] arr) {
		int count = 0; // 统计不及格人数
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 60) { // 如果产生的数值小于60
					count++;
				}
			}

		}
		return count;
	}

	// (2)打印班级平均分(封装成方法)
	public static double getAvrgScore(int[][] arr) {
		double sum = 0; // 累计总分数
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}

		}
		return sum / (arr.length * arr[0].length); // 总分数 / ( 行数 * 列数 )
	}
}
