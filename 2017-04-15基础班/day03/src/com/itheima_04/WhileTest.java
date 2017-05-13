package com.itheima_04;

/**
 * while结构实现1-100的累加
 * @author Ulric
 *
 */

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 100){
			sum += i;
			i++;
		}
		System.out.println("1+2+3+...+100=" + sum);
	}
}
