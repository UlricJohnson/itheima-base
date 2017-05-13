package com.itheima;

import java.util.Scanner;

/**
 * (1).键盘录入一个整数给变量x，输出对应的变量y的值

     (2).x值和y值的对应关系如下：

               x<0 y=-1

               x=0 y=0

               x>0 y=1

     (3).如果用户输入的x的值为2，程序运行后打印格式"x=2,y=1"
 * @author Ulric
 *
 */

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入x的值：");
		int x = scanner.nextInt();
		if (x < 0) {
			System.out.println("x=" + x + ", y=-1");
		} else if(x == 0){
			System.out.println("x=" + x + ", y=0");
//		}else if(x > 0){
		}else{
			System.out.println("x=" + x + ", y=1");
		}
	}

}
