package com.itheima.test5;

public class Test5 {

	public static void main(String[] args) {
		String str = "  anglebaby  	女 	 18	  515151511  ";
		String qqNumRegex = "[^0]\\d{5,11}";
		String[] datas = str.trim().split("\\s+");
		Person ab = new Person(datas[0], datas[1], datas[2], datas[3]);
		System.out.println(ab.toString());

		System.out.println(ab.getQq().matches(qqNumRegex) ? ab.getName() + "的QQ符合规则" : ab.getName() + "的QQ不符合规则");
	}

}
