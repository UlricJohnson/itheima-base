package com.itheima2;

/**
 * 面向对象demo3
 * 
 * 类中数据的封装
 * 
 * private 关键字
 * 
 * @author Ulric
 *
 */

class StudentDemo2 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("年龄不能为负数！");
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public void showMsg() {
		System.out.println("name: " + this.name + "\tage: " + this.age);
	}
}
