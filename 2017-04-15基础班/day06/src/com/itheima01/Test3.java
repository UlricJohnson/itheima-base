package com.itheima01;

/**
 * 输出5位数中的所有回文数
 * 
 * @author Ulric
 *
 */

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10000; i < 100000; i++) {
			int digit = i % 10; // 个位
			int tensDigit = i / 10 % 10;// 十位
			int thousandsDigit = i / 10 / 10 / 10 % 10;// 千位
			int tenThousandsDigit = i / 10 / 10 / 10 / 10 % 10;// 万位
			
		}
	}

}
