package com.itheima;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usrNameRegex = "[a-zA-Z]\\w{5,11}";

		System.out.println("请输入用户名：");

		String input = sc.nextLine();
		System.out.println(input.matches(usrNameRegex) ? "用户名合法" : "用户名非法");
	}

}
