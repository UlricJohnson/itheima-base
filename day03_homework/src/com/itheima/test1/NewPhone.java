package com.itheima.test1;

public class NewPhone extends Phone implements Play {

	public NewPhone() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playGame() {
		System.out.println("新手机可以玩游戏");
	}

}
