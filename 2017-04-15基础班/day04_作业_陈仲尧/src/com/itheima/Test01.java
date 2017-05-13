package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现

     1.键盘录入班级人数

     2.根据录入的班级人数创建数组

     3.利用随机数产生0-100的成绩(包含0和100)

     4.要求:

       (1)打印该班级的不及格人数

       (2)打印该班级的平均分

       (3)演示格式如下:

                        请输入班级人数:

                        键盘录入:100

                        控制台输出:
                                 不及格人数:19

                                 班级平均分:87
 * @author Ulric
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入班级人数:");
		
		int numOfStu = scanner.nextInt();
		int[] stus = new int[numOfStu];	// 创建数组
		int count = 0;	// 统计不及格人数
		int sum = 0;	// 累计总分数
		
		for (int i = 0; i < stus.length; i++) {
			stus[i] = random.nextInt(101);	// 随机产生[0,100]的数值并存到数组中
			sum += stus[i];		// 累加到总分数中
			if(stus[i] < 60){	// 如果产生的数值小于60
				count++;
			}
		}
		
		System.out.println("不及格人数：" + count + "\n班级平均分：" + sum * 1.0 / numOfStu);
		
	}

}
