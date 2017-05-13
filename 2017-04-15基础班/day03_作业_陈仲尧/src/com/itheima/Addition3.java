package com.itheima;

import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现：

 (1).键盘录入三个整数，按照从小到大的顺序输出

 (2).如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 如果声明多个变量的话可能会更容易，但是会更浪费空间
		 * 就想着能不能在能够实现的前提下，尽量少地声明变量
		 */
		// #1 (自己写)
		int lesser;	
		int more;
		int temp;
		
		System.out.print("请输入3个整数：");
		
		lesser = scanner.nextInt();		// 先输入两个数值
		more = scanner.nextInt();
		
		if(lesser > more){	// 如果lesser数值比more大，则调换
			temp = lesser;
			lesser = more;
			more = temp;
		}
		
		temp = scanner.nextInt();	// 保证lesser数值比more小后，输入第3个数值
		
		if(temp < lesser){	// 第3个数最小
			System.out.println("按照从小到大排序后的顺序为：" + temp + " " + lesser + " " + more);
		}else if(temp > lesser && temp < more){	// 第3个数为中间值
			System.out.println("按照从小到大排序后的顺序为：" + lesser + " " + temp + " " + more);
		}else if(temp > more){	// 第3个数为最大值
			System.out.println("按照从小到大排序后的顺序为：" + lesser + " " + more + " " + temp);
		}
		
		// #2 把全部数据一次性输入，排序后输出(冒泡或直接比较交换)
		
		
		
	}
}
