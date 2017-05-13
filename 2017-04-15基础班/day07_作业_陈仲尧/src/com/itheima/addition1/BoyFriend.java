package com.itheima.addition1;

public class BoyFriend {
	private String name;
	private double height;

	public BoyFriend() {
		// TODO Auto-generated constructor stub
	}

	public BoyFriend(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void earn() {
		System.out.println(name + "会挣钱");
	}

	public void play(GirlFriend girlFriend) {
		System.out.println(name + "和" + girlFriend.getName() + "一起幸福的玩耍。");
	}

}
