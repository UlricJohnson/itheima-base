package com.itheima;

import java.util.Scanner;

/**
 * (1).键盘录入学生成绩(整数类型),如果录入的成绩为-1 表示录入结束

     (2).打印输出录入的学生成绩的平均值
 * @author Ulric
 *
 */

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入你的成绩(输入-1表示退出)：");
		int score;
		int sum = 0;
		int count = 0;
		
		while(true){
			score = scanner.nextInt();
//			System.out.println("继续？");
			if(score == -1){
				break;
			}
			count++;
			sum += score;
		}
		
		// 修复bug：如果count为0
		if(count == 0){
			
		}else{
			System.out.println("你录入了" + count + "个成绩，" + "平均成绩为：" + sum * 1.0 / count);
		}
		
		
	}

}
