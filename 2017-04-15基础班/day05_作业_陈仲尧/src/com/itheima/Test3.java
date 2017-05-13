package com.itheima;

import java.util.Random;

/**
 * 一个班级有60人,考试成绩是0-100之间 为每一位同学随机生成一个成绩; 要求: 1. 写一个方法,获取班级所有学生成绩 2. 写一个方法计算班级总成绩
 * 3. 写一个方法计算班级平均成绩 4. 写一个方法统计班级的不及格人数
 * 
 * @author Ulric
 *
 */

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = getAllScores();// 获取全班成绩

		// 打印全班成绩，每6个一行
		System.out.print("全班同学成绩如下：\n");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "  ");
			if (i > 0 && (i + 1) % 6 == 0) {
				System.out.println();
			}
		}

		// 打印总成绩
		System.out.print("全班总成绩为：" + getTotalScore(scores) + "\n");

		// 打印平均成绩
		System.out.print("平均成绩为：" + getAvrgScore(scores, 60) + "\n");

		// 打印不及格人数
		System.out.print("不及格人数为：" + getNumOfFail(scores) + "\n");
	}

	// 1.获取班级所有学生成绩
	public static int[] getAllScores() {
		Random random = new Random();
		int[] scores = new int[60];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(101);// 随机生成[0,100]之间的成绩
		}
		return scores;
	}

	// 2.计算班级总成绩
	public static int getTotalScore(int[] scores) {
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return totalScore;
	}

	// 3.计算班级平均成绩
	public static double getAvrgScore(int[] scores, int numOfStu) {
		return getTotalScore(scores) / numOfStu;
	}

	// 4.统计班级的不及格人数
	public static int getNumOfFail(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 60) {
				count++;
			}
		}
		return count;
	}
}
