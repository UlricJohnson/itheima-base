package com.itheima;

/**
 * (1).打印1到100之内的整数，但数字中包含9的要跳过

 	(2).每行输出5个满足条件的数，之间用空格分隔

 	(3).如：1 2 3 4 5
 * @author Ulric
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;	// 统计每行输出了多少个满足条件的数
		for (int i = 1; i <= 100; i++) {
			if((i >= 90 && i < 100) || (i % 10 == 9)){	// 十位数为9或者个位数为9的跳过	
//				count--;	// 不用减，不满足条件的数字已被跳过，并没有统计
				continue;
			}
			System.out.print(i + " ");
			count++;
			if(count % 5 == 0){	// 控制每输出5个数字换行一次
				System.out.println();
			}
		}
	}

}
