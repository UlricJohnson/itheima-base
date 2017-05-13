package com.itheima02;

import java.util.Scanner;

/**
 * 模拟用户登录
 * 
 * @author Ulric
 *
 */

public class StringClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String userName = "admin";
		String password = "admin";

		int chances = 3;
		for (int i = 0; i < chances; i++) {
			System.out.println("请输入登录名和密码：");
			String usrN = scanner.next();
			String pwd = scanner.next();
			if (usrN.equals(userName) && pwd.equals(password)) {
				System.out.println("登录成功！");
				break;
			} else {
				if (i == 2) {// 最后一次登陆失败
					System.out.println("账号已被锁定，请与管理员联系！");
				} else {
					System.out.println("用户名或密码错误！您还有" + (2 - i) + "次机会");
				}
			}
		}
	}

	// public static boolean isCorrect(String usrN, String pwd) {
	//
	// return false;
	// }

}
