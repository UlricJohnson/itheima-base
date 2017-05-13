package com.itheima.q2;

import java.util.ArrayList;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer mj = new Singer("Michael Jackson", "男", 51);

		ArrayList<String> aList = new ArrayList<>();
		aList.add("Bad");
		aList.add("Billy Jeans");
		aList.add("We Are The World");
		aList.add("You Are Not Alone");
		aList.add("Beat It");

		mj.sing(aList.get(new Random().nextInt(aList.size())));
	}

}
