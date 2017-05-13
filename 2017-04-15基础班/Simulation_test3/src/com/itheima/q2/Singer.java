package com.itheima.q2;

public class Singer {
	private String name;
	private String sex;
	private int age;

	public Singer() {
		// TODO Auto-generated constructor stub
	}

	public Singer(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sing(String song) {
		System.out.println("歌手" + name + "正在演唱" + song + "歌曲");
	}

}
