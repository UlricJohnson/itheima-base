package com.itheima3;

/**
 * 构造方法重载
 * 
 * @author Ulric
 *
 */

public class StudentDemo4 {
	private String name;
	private int age;

	public StudentDemo4() {
		// TODO Auto-generated constructor stub
//		System.out.println("无参构造方法");
	}

	public StudentDemo4(String name) {
		this.name = name;
	}

	public StudentDemo4(int age) {
		this.age = age;
	}

	public StudentDemo4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showMsg() {
		System.out.println(this.name + "----" + this.age);
	}

}
