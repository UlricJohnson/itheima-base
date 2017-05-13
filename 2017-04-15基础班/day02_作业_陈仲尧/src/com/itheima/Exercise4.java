package com.itheima;

import java.util.Scanner;

/**
 * 4、
分析以下需求，并用代码实现

         (1).键盘录入一个学生成绩(int类型)

         (2).判断该学生成绩是否及格

         (3).打印格式：

                   成绩>=60:打印"合格"

                   成绩<60:打印"不合格"
 * @author Ulric
 *
 */

public class Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = scanner.nextInt();
		System.out.println(score >= 60 ? "合格" : "不合格");
	}
}
