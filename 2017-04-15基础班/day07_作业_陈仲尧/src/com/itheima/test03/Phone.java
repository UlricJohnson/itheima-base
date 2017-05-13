package com.itheima.test03;

class Phone {
	private String brand;
	private int price;

	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void call() {
		System.out.println("正在使用价格为 " + price + "元的" + brand + "品牌的手机打电话...");
	}

	public void sendMessage() {
		System.out.println("正在使用价格为 " + price + "元的" + brand + "品牌的手机发短信...");
	}

	public void playGame() {
		System.out.println("正在使用价格为 " + price + "元的" + brand + "品牌的手机玩游戏...");
	}
}
