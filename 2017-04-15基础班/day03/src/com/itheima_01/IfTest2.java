package com.itheima_01;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你的成绩（0-100）：");
		short score = scanner.nextShort();
		if(score < 0 || score > 100){
			System.out.print("输入错误！");
		}else if(score >= 90){
			System.out.println("优秀！");
		}else if(score >= 80){
			System.out.println("好！");
		}else if(score >= 70){
			System.out.println("良！");
		}else if(score >= 60){
			System.out.println("及格！");
		}else{
			System.out.println("不及格！");
		}
	}
}
