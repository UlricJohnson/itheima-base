package com.itheima;

import java.util.Scanner;

/**
 * 根据输入的值，判断是星期几。(分别用if语句和switch语句实现)
	输入：1	 
	输出：星期1	
 * @author Ulric
 *
 */

public class Addition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入一个整数(1-7)：");
		byte num = scanner.nextByte();
		
		// #1 if语句实现
		if (num == 1) {
			System.out.println("星期一");
		} else if(num == 2){
			System.out.println("星期二");
		}else if(num == 3){
			System.out.println("星期三");
		}else if(num == 4){
			System.out.println("星期四");
		}else if(num == 5){
			System.out.println("星期五");
		}else if(num == 6){
			System.out.println("星期六");
		}else if(num == 7){
			System.out.println("星期日");
		}else{
			System.out.println("非法输入！");
		}
		
		System.out.println("------------------------");
		
		// #2 switch语句实现
		switch (num) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("非法输入！");
			break;
		}
	}

}
