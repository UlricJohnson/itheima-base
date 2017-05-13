package com.itheima.test01;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 经理类
		Manager manager = new Manager("Michael Jordan", "itheima123", 15000, 2500);
		manager.work();

		// 程序员类
		Coder coder = new Coder();
		coder.setName("Kobe Bryant");
		coder.setId("itheima456");
		coder.setSalary(12000);
		coder.work();
	}

}
