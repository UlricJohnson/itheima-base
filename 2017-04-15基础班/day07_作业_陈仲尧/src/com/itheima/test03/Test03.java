package com.itheima.test03;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone1 = new Phone();
		phone1.setBrand("APPLE");
		phone1.setPrice(6999);
		phone1.call();
		phone1.sendMessage();
		phone1.playGame();

		Phone phone2 = new Phone("HUAWEI", 4499);
		phone2.call();
		phone2.sendMessage();
		phone2.playGame();
	}

}
