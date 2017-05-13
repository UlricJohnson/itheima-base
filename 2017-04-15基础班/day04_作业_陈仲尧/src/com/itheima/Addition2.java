package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
         1.基础班考试要进行分组,键盘录入该班级总共多少组?以及每组的学生数量?
         2.根据录入的组数及每组学员的数量创建二维数组
         3.利用随机数产生0-100的成绩(包含0和100)
         4.要求:
           (1)打印该班级中每组的不及格人数
           (2)打印该班级中每组的平均分
           (3)打印组的最高平均分
           (4)演示格式如下:
                            请输入班级总组数:3
                            请输入班级中每组的人数:10
                            控制台输出:
                                     第1组不及格人数为: 6 人
                                     第1组平均分为: 52
                                     第2组不及格人数为: 7 人
                                     第2组平均分为: 46
                                     第3组不及格人数为: 3 人
                                     第3组平均分为: 69
                                     班级中单组最高平均分为:69
 * @author Ulric
 *
 */

public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入班级总组数:");
		int row = scanner.nextInt();
		System.out.print("请输入班级中每组的人数:");
		int col = scanner.nextInt();
		int[][] stus = new int[row][col];	// 创建数组
		
		for (int i = 0; i < stus.length; i++) {
			int count = 0;	// 统计不及格人数
			int sum = 0;	// 累计总分数
			for (int j = 0; j < stus[i].length; j++) {
				stus[i][j] = random.nextInt(101);	// 随机产生[0,100]的数值并存到数组中
				sum += stus[i][j];		// 累加到总分数中
				if(stus[i][j] < 60){	// 如果产生的数值小于60
					count++;
				}
			}
			System.out.println("第"+ (i + 1) +"组中不及格人数为:" + count + "人\n第" + (i + 1) + "组平均分为: " + (sum * 1.0) / stus[i].length);
			
		}
		
//		System.out.println(" 班级中不及格人数为:" + count + "\n班级总平均分为: " + (sum * 1.0) / (row * col));
	}

}
