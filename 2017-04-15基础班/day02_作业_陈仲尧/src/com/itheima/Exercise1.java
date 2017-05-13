package com.itheima;

import java.util.Scanner;

/**
 * 1. 分析以下需求，并用代码实现
    (1).键盘录入一个三位整数数，请分别获取该三位数上每一位的数值
    (2).例如：键盘录入的整数123的个位、十位、百位，分别是3、2、1
    (3).打印格式:"数字123的个位是 3, 十位是 2, 百位是 1"
 * @author Ulric
 *
 */

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// #1
		System.out.println("请输入一个三位数: ");
		int num = scanner.nextInt();
		String str = "" + num;
		char[] chs = str.toCharArray();
		System.out.println("数字" + num + "的个位是" + chs[2]
				+ ", 十位是" + chs[1] + ", 百位是" + chs[0]);
		
		// #2
//		System.out.println("请输入一个整数(10位数以内): ");
//		String str = scanner.nextLine();
//		char[] chs = str.toCharArray();
//		String[] strs = {"个", "十", "百", "千", "万", "十万", "百万", "千万","亿","十亿"};
//		System.out.println("数字" + str + "的个位是" + chs[2]
//				+ ", 十位是" + chs[1] + ", 百位是" + chs[0]);
		
	}
}
