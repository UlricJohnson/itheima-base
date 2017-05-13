package com.itheima_03;

public class ForTest3 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 2){
				sum += i;
			}
		}
		System.out.println("sum: " + sum);
	}
}
