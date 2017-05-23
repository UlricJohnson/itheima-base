package com.itheima.test6;

/**
 * 就业班老师类
 * 
 * @author Ulric
 *
 */

public class EmploymentObtainClassTeacher extends Teacher {

	public EmploymentObtainClassTeacher() {
	}

	public EmploymentObtainClassTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("就业班老师讲JavaEE");
	}

}
