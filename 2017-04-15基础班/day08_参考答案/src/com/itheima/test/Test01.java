package com.itheima.test;

import java.util.Scanner;

public class Test01 {
	/*
第1题: 分析以下需求,并用代码实现
	1.键盘录入一个字符串
	2.将该字符串变成字符数组(不能使用toCharArray()方法)
	3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
	4.如果第一位和最后一位的内容不相同,则交换
	5.将字符数组中索引为偶数的元素变成'~'
	6.打印数组元素的内容
	 */
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
		//2.将该字符串变成字符数组(不能使用toCharArray()方法)
		char[] arr = toCharArr(line);
		//打印数组
		print(arr);
		//3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
		changeArr(arr);
		print(arr);
		//4.如果第一位和最后一位的内容不相同,则交换
		swapFirstLast(arr);
		print(arr);
		//5.将字符数组中索引为偶数的元素变成'~'
		changeOu(arr);
//		打印数组元素
		print(arr);
	}

	/*
	2.将该字符串变成字符数组(不能使用toCharArray()方法)
	    思路:
	   	1. 创建一个字符数组,字符数组的元素个数为字符串的长度
	   	2. 遍历字符串
	   	3. 把字符串中每一个索引上的字符,赋值给对应索引的数组元素.
	   	4. 返回字符数组.
	 */
	public static char[] toCharArr(String line) {
		//创建字符数组
		char[] arr = new char[line.length()];
		//遍历字符串，拿到每一个字符
		for (int i = 0; i < line.length(); i++) {
			//将字符存入字符数组中
			arr[i] = line.charAt(i);
		}
		//将字符数组返回
		return arr;
	}
	/*
	  3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
	 思路:
	  	1. 遍历字符数组
	  	2. 在遍历中,如果字符是大写字符,就把当前字符转换为小写字符,并赋值回去.
	  	3. 把大写字母转换小写字母,根据ASCII码表特点来实现了; 在计算机中字符的本质就是数字,而我们看的到字符是拿数字查ASCII码表获得的
	  	      在ASCII码表中小写字母和大写字母都是连续的,所以大写字母与小写字母的差值是相同的如: 'a'-'A' == 'b'-'B' ....
	  	      所以: 小写字母 = 大写字母 + ('a'-'A')
	  	4. 注意: 字符进行运算会提升为int类型,赋值回去的时候,需要强制类型转换.
	 
	 */
	public static void changeArr(char[] arr) {
		//遍历字符数组
		for (int i = 0; i < arr.length; i++) {
			//对每一个字符进行判断,根据ASCII表判断。大写字母在65--90('A'-'Z')范围之间,小写范围 ('a'-'z')
			// 'a'-'A' == 'b'-'B' == 'c'-'C'
			// 'B' + ('a'-'A') 
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				//将大写字母变成小写字母。加32即可
				arr[i] = (char) (arr[i]+('a'-'A'));
			}
		}
	}
	
/*  
    4.如果第一位和最后一位的内容不相同,则交换
         思路:
         1. 取出第一个索引(0索引)上的元素
         2. 取出最后索引上(arr.length-1)的元素
         3. 如果第一个索引的元素与最后一个索引的元素不同,就交换
 */
	public static void swapFirstLast(char[] arr) {
		char c1 = arr[0];	//获取第一个元素
		char c2 = arr[arr.length-1];	//获取最后一个元素
		if(c1 != c2) {	//如果不相等，则交换
//			把最后一个元素的值赋值给数组的0索引
			arr[0] = c2;
//			把第一个元素的值赋值给数组的最后一个索引.
			arr[arr.length-1] = c1;
		}
	}

	/*
	 * 	5.将字符数组中索引为偶数的元素变成'~'
	    思路:
	    1. 使用for循环遍历数组
	    2. 在遍历过程中,如果索引为偶数,就把该索引对应的元素设置为~
	 */
	public static void changeOu(char[] arr) {
		//遍历字符数组
		for (int i = 0; i < arr.length; i++) {
			//如果索引为偶数
			if(i % 2 == 0) {
				//将当前元素变成'~'
				arr[i] = '~';
			}
		}
	}



/*
   6. 打印数组元素的内容
   	思路:
   	   1. 遍历数组
   	   2. 输出元素,多个元素使用空格隔开
   	   3. 循环结束,输出换行.
 */

	public static void print(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


}
