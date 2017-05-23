package com.itheima.test4;

/**
 * 会打篮球的学生类
 * 
 * @author Ulric
 *
 */

public class StudentCanPlayBasketball extends Student implements Sport {

	public StudentCanPlayBasketball() {
	}

	public StudentCanPlayBasketball(String name, int age) {
		super(name, age);
	}

	@Override
	public void playBasketball() {
		System.out.println("该学生会打篮球");
	}

}
