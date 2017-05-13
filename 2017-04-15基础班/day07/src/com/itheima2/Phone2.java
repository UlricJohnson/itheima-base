package com.itheima2;

/**
 * 
 * @author Ulric
 *
 */

class Phone2 {
	private String brand;
	private int price;

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

	public void call(String name) {
		System.out.println("call " + name);
	}

	public void sendMessage(String name) {
		System.out.println("send a message to " + name);
	}
}
