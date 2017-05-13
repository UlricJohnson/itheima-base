package com.itheima;

public class TestPhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneDemo myPhone = new PhoneDemo();

		System.out
				.println("my phone's brand:" + myPhone.brand + "\tprice:" + myPhone.price + "\tcolor:" + myPhone.color);

		myPhone.brand = "Apple";
		myPhone.price = 4699;
		myPhone.color = "black";

		System.out
				.println("my phone's brand:" + myPhone.brand + "\tprice:" + myPhone.price + "\tcolor:" + myPhone.color);
		myPhone.call("Steve Jobs");
		myPhone.sendMsg("LeBron James");
		myPhone.sendMsg();

	}

}
