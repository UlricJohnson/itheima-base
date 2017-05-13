package com.itheima.test;

import java.util.Scanner;

public class Test03 {
	/*
	 * 第3题: 分析以下需求,并用代码实现
	1.键盘录入一个源字符串由字符串变量scrStr接收
	2.键盘录入一个要删除的字符串由字符串变量delStr接收
	3.要求
		删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
	4.代码运行打印格式:
		请输入源字符串:java woaijava,i like jajavava i enjoy java
		请输入要删除的字符串:java
		控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like  i enjoy
  
     思路:
      
      1. 创建缉拿盘录入对象
      2. 使用键盘录入对象获取用户录入原串和要删除的子字符串
      3. 删除原串中的要删除的子串
      4. 统计删除个数子串个数
      
      由于删除原串中的子串,并统计个数; 是一个功能,为了提高程序复用性; 单独写一个方法
      两个明确:
      	明确参数列表: 原字符串,要删除的子串
      	返回值类型: 删除子串的个数
      
	 */
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入源字符串：");
		String srcStr = sc.nextLine();
		System.out.println("请录入要删除的字符串：");
		String delStr = sc.nextLine();
		//调用删除并打印信息方法
//		deleteStr(srcStr,delStr);
		deleteStr2(srcStr,delStr);
	}

//  方式1: 删除子字符串,并统计次数
/*
	 思路: 
	 	1. 定义一个计数器变量
	 	2. 使用while循环,判断如果原串中要删除的子串则进入循环
	 	3. 在循环体中,使用replaceFirst方法,替换掉原串中第一次出现的要删除子串
	 	4. 计数器变量++
	 	5. 当循环结束后,就删除了原串中所有的要删除子串,并且统计出来了删除的个数
	 	7. 返回被删除子串的个数.
	 
*/
	public static void deleteStr(String srcStr, String delStr) {
		//定义统计删除次数的计数器
		int count = 0;
		//循环删除，
//	    contains: 如果src中包含delStr就返回true,如果不包含就返回false
		while(srcStr.contains(delStr)) {
			//调用替换第一次出现的方法
//		    使用""替换delStr第一次出现的位置
			srcStr = srcStr.replaceFirst(delStr, "");
			//计数器自增
			count++;
		}
		System.out.println("源字符串中共包含：" + count + "个" + delStr + ".删除后的字符串为：" + srcStr);
	}
	
//	第二种方式: 删除子字符串,并统计子字符串出现的次数.
/*
 	总思路:
 		1. 先把String转换为StringBuilder 
 		2. 使用StringBuilder的delete(int start,int end)方法删除子串
 	 具体步骤:
 	 	1. 定义计数器变量
 	 	2. 把String转换为StringBuilder
 	 	3. 定义变量用于记录delStr第一次出现的索引
 	 	4. 使用while循环,在判断条件语句中,使用indeOf方法获取要删除的子串在原串中第一次出现的索引,并赋值给index,如果!=-1,就说明还有子串存在
 	 	5. 在循环体中
 	 	   1. 计算要删除的子串的结束索引 = 开始索引+要删除子串的长度
 	 	   2. 调用StringBuilder的delete(int start,int end)方法删除子串
 	 	   3. 计数器变量++
 	 	6. 返回删除子串的个数.
 		
 */	
	public static void deleteStr2(String srcStr, String delStr) {
//		定义一个统计变量
		int count = 0;
//		把字符串转换为StringBuilder对象
		StringBuilder sb = new StringBuilder(srcStr);
//		定义变量用于记录delStr第一次出现的索引
		int index = 0;
		
//		请输入源字符串:java woaijava,i like jajavava i enjoy java
//		请输入要删除的字符串:java
//		sb.delete(0, 4);
//		开始索引:index
//		结束索引: index+java.length();
//		循环删除
		while((index = sb.indexOf(delStr)) !=-1){
//			sb中为delStr的字符
			sb.delete(index,index+delStr.length());
			count++;
		}
		System.out.println("源字符串中共包含：" + count + "个" + delStr + ".删除后的字符串为：" + sb.toString());
	}
		
}
