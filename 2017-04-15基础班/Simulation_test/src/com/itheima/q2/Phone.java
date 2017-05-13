package com.itheima.q2;

/*
 * 1. 定义”手机”类Phone,成员属性有: brand(品牌),String类型;  price(价格), int类型;使用 private修饰,
 * 给所有属性提供set/get方法,并只提供满参构造方法.
 */

public class Phone {
	private String brand;
	private int price;

	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
