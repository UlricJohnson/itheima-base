package com.itheima.test5;

/*
5.有一段文本 "  anglebaby 女 18 515151511  " 
   分别描述一个人,姓名,性别,年龄(String),QQ号码信息,完成如下需求:
   1. 创建一个Person类,包含性别,性别,年龄和QQ号码属性,使用解析出来信息创建一个Person对象,并打印这个人信息
   2. 并判断QQ号是否合法.(全部都是数字,第一位非0,长度为5到12位即为合法) 
 */

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="  anglebaby 女 18 515151511  ";
		String[] msgs=string.trim().split(" ");
		
		Person p1 = new Person(msgs[0],msgs[1],msgs[2],msgs[3]);
		
		System.out.println(p1.getName()+"--"+p1.getSex()+"--"+p1.getAge()+"--"+p1.getQqString());
		
		if(isQQLegal(p1.getQqString())){
			System.out.println("QQ合法");
		}else{
			System.out.println("QQ不合法");
		}
		
	}

	public static boolean isQQLegal(String qq) {
		if (qq.startsWith("0")) {// 以0开头为非法
			return false;
		} else if (qq.length() < 5 || qq.length() > 12) {// 长度小于5或大于12为非法
			return false;
		}
		return true;
	}

}
