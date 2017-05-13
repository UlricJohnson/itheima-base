package com.itheima.test;

import java.util.Scanner;

public class TestAdditional01 {
	/*
	1. 分析以下需求，并用代码实现：
	(1)从键盘录入一个字符串
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
		举例:
			键盘录入：Hello12345World
			输出结果：hELLO*****wORLD
			总共10个字母
	 思路: 
	  一般只要是改变了原串的内容的,通常把字符串转换为StringBuilder再进行处理
	 1. 创建键盘录入对象
	 2. 接收录入的字符串
	 3. 把字符串转换为StringBuilder
	 4. 遍历StringBuilder的字符
	 5. 在循环,判断该字符是大写的就转换为小写,小的就转换为大写,其他的转换*
	 6. 然后再使用StringBuilder的setCharAt(int index,char ch)设置回去
	 7. 在循环结束把StringBuilder转换String即可;然后输出该字符串
     这里重点: 
     大写字母转换小写字母
     	ch = ch + ('a'-'A');
    小写字母转大写字母
  		ch = ch + ('A'-'a')
	 */
	public static void main(String[] args) {
//		 1. 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		 2. 接收录入的字符串
		System.out.println("请录入一个字符串");
		String str = sc.nextLine();
//		 3. 把字符串转换为StringBuilder
		StringBuffer sb = new StringBuffer(str);
//		 4. 遍历StringBuilder的字符
		for(int i=0; i<sb.length(); i++){
//		 5. 在循环,判断该字符是大写的就转换为小写,小的就转换为大写,其他的转换*
			char ch = sb.charAt(i);
//			注意: 1. 这里是>= 和 <= 否则不不包含A或Z
//			     2. 这里的A和Z都是大写字母;
//			如果是大写字母就转换为小写字母
			if(ch >= 'A' && ch <= 'Z'){
				ch += ('a'-'A');
			}else if(ch >= 'a' && ch <= 'z'){
//				如果是小写字母就转换为大写字母
				ch += ('A'-'a');
			}else {
//				如果是其他字符,就转换为*
				ch = '*';
			}
//		 6. 然后再使用StringBuilder的setCharAt(int index,char ch)设置回去
			sb.setCharAt(i, ch);
		}
//		7. 在循环结束把StringBuilder转换String即可;然后输出该字符串
		String newStr = sb.toString();
		System.out.println(newStr);
	}
}
