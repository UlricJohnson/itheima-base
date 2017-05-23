package com.itheima.test5_3;

public class Animal {
	private String color;
	private int numOfLeg;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String color, int numOfLeg) {
		super();
		this.color = color;
		this.numOfLeg = numOfLeg;
	}

	public void eat() {
		System.out.println("动物也要吃饭");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumOfLeg() {
		return numOfLeg;
	}

	public void setNumOfLeg(int numOfLeg) {
		this.numOfLeg = numOfLeg;
	}

}
