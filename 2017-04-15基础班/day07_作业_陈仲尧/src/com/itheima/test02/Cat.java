package com.itheima.test02;

/**
 * (1).猫类Cat
 * 
 * 属性:
 * 
 * 毛的颜色color
 * 
 * 品种breed
 * 
 * 行为:
 * 
 * 吃饭eat()
 * 
 * 抓老鼠catchMouse()
 * 
 * @author Ulric
 *
 */

public class Cat {
	private String color;
	private String breed;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String color, String breed) {
		this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void eat() {
		System.out.println(color + "的" + breed + "正在吃鱼");
	}

	public void catchMouse() {
		System.out.println(color + "的" + breed + "正在逮老鼠");
	}

}
