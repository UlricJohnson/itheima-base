package com.itheima.test6;

public class BlueBall extends DoubleColorBall {

	public BlueBall() {
		this.setColor("blue");
		int[] numbers = new int[16];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		this.setNumbers(numbers);
	}
	
	

}
