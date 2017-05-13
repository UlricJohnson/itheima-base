package com.itheima.addition2;

public class Car {
	private String brand;
	private String color;
	private double price;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void run() {
		System.out.println("价值" + price + "万美元的" + color + brand + "汽车在飞驰");
	}

}
