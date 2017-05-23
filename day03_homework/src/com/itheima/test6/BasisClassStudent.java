package com.itheima.test6;

/**
 * 基础班学生类
 * 
 * @author Ulric
 *
 */

public class BasisClassStudent extends Student {

	public BasisClassStudent() {
	}

	public BasisClassStudent(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println("基础班学生学JavaSE");
	}

}
