package com.itheima.test6;

/**
 * 基础班老师类
 * 
 * @author Ulric
 *
 */

public class BasisClassTeacher extends Teacher {

	public BasisClassTeacher() {
	}

	public BasisClassTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("基础班老师讲JavaSE");
	}

}
