package com.itheima.test6;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateNumbers());

	}

	public static String generateNumbers() {
		StringBuilder sBuilder = new StringBuilder("[");

		RedBall rb = new RedBall();
		BlueBall bb = new BlueBall();

		// 产生6个红球号码
		for (int i = 0; i < 6; i++) {
			int redNum = rb.getNumber();
			if (redNum < 10) {
				sBuilder.append("0" + redNum + ", ");
			} else {
				sBuilder.append(redNum + ", ");
			}
		}

		// 产生1个蓝球号码
		int blueNum = bb.getNumber();
		if (blueNum < 10) {
			sBuilder.append("0" + blueNum + "]");
		} else {
			sBuilder.append(blueNum + "]");
		}

		return sBuilder.toString();
	}

}
