package com.itheima_03;

/**
 * 输出所有水仙花数
 * @author Ulric
 *
 */

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 1000; i++) {
			int digit = i % 10;				// 个位
			int tenDigit = i / 10 % 10;		// 十位
			int hundredDigit = i / 10 / 10 % 10;// 百位
			if(Math.pow(digit, 3) + Math.pow(tenDigit, 3) + Math.pow(hundredDigit, 3) == i){
				System.out.println(i);
			}
		}
	}

}
