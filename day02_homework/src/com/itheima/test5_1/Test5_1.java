package com.itheima.test5_1;

public class Test5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Griffin", "gz123", 15000, 3500);
		Programmer pgm = new Programmer("Zark", "usa45", 12000);

		manager.work();
		pgm.work();
	}

}
