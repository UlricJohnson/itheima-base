package com.itheima.test;

import java.util.Scanner;

public class Test04 {
	/*
	 4.分析以下需求，并用代码实现
         (1).键盘录入一个大字符串,再录入一个小字符串
         (2).统计小字符串在大字符串中出现的次数
         (3).代码运行打印格式:
                  请输入大字符串:javajavajava I love java l like jajavava I enjoy javajavajava
                  请输入小字符串:java
                  控制台输出:小字符串java,在大字符串javajavajava I love java l like jajavava I enjoy javajavajava中共出现8次*/
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入大字符串：");
		String big = sc.nextLine();
		System.out.println("请输入小字符串：");
		String small = sc.nextLine();
		//调用统计次数的方法
		int count = getCount2(big,small);
		System.out.println("小字符串" + small + "，在大字符串" + big + "中出现了：" + count + "次");
	}
/*
       请输入大字符串:javajavajava I love java l like jajavava I enjoy javajavajava
       请输入小字符串:java 
 */
	
//	方式1: 统计大字符串中小字符串出现的次数.
/*
    思路: 
 	 1. 定义统计次数的计数器
 	 2. 定义记录出现索引位置的变量
 	 3. 使用while获取统计子串第一次出现索引,如果!=-1就进入循环体
 	 4. 找到一次,count++
 	 5. 为了避免重复找,使用subString(int start)方法获取原串中第一次出现子串的以后的字符串,然后赋值给原串.
 	 6. 当循环结束的时候,就统计出来,原串中子串出现的次数.
 	
 */
	public static int getCount(String big, String small) {
		//定义统计次数的计数器
		int count = 0;
		//定义记录出现索引位置的变量
		int index = 0;
		//只要可以查找到，就一直查找
		while((index = big.indexOf(small)) != -1) {
			//计数器自增
			count++;
			//查找到以后，将第一次出现的位置之前的所有内容内容都截取掉！
			big = big.substring(index+small.length());
		}
		//返回次数
		return count;
	}
	
//	方式2:统计大字符串中,小字符串出现的次数
/*
 	 1. 替换原串中出现的所有子串,获取一个替换后的字符串replaced
 	 2. 使用 (使用原串的长度-被替换后的字符串的长度)/子串的长度 == 子串出现的次数
 	 3. 返回子串出现的次数.
 */
	public static int getCount2(String big, String small) {
//		使用空替换掉所有小串(small)
		String replaced = big.replace(small, "");
//	    (大串的长度-替换后长度)/小串的长度； 就是小串在大串中出现的次数	
//        请输入大字符串:javajavajava I love java l like jajavava I enjoy javajavajava
//        请输入小字符串:java
		int count = (big.length()-replaced.length()) / small.length();
		return count;
	}
	
}
