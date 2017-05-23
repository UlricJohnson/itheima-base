package com.itheima.test6;

/**
 * 就业班学生类
 * 
 * @author Ulric
 *
 */

public class EmploymentObtainClassStudent extends Student {

	public EmploymentObtainClassStudent() {
	}

	public EmploymentObtainClassStudent(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println("就业班学生学JavaEE");
	}

}
