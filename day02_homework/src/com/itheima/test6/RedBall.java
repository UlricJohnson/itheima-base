package com.itheima.test6;

import java.util.Random;

public class RedBall extends DoubleColorBall {

	public RedBall() {
		this.setColor("red");
		int[] numbers = new int[33];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		this.setNumbers(numbers);
	}

	// 从数组中随机获取一个数字
	// public int getNumber() {
	// Random random = new Random();
	// return this.getNumbers()[random.nextInt(33) + 1];
	// }

}
