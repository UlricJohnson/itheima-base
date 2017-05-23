package com.itheima.test3;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meeting(new Manager("李俊", "cn548", 25000, 5000));
		meeting(new Programmer("张三", "sh578", 18000));

	}

	public static void meeting(Employee emp) {
		emp.meet();
		emp.work();
	}

}
