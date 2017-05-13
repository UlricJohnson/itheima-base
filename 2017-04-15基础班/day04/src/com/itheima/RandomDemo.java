package com.itheima;

import java.util.Random;

/**
 * Random类：此类的实例用于生成伪随机数流
 * @author Ulric
 *
 */

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			int number = random.nextInt(10);	// 产生[0,10)随机数
			System.out.println("number:" + number);
		}
		System.out.println("---------------");
		
		// 随机获取1-100之间的整数
		System.out.println(random.nextInt(100) + 1);
	}

}
