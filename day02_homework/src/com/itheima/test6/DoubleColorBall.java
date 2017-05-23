package com.itheima.test6;

import java.util.Random;

public class DoubleColorBall {
	private String color;
	private int[] numbers;

	public DoubleColorBall() {}

	public int getNumber() {
		Random random = new Random();
		return this.getNumbers()[random.nextInt(numbers.length) + 1];
	}

	// get set
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

}
