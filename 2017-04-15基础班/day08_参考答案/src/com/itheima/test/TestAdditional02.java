package com.itheima.test;

public class TestAdditional02 {
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		demo5();
	}
	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";//这里s3是一个新对象,
							 // s1是一个变量,编译器不能对变量进行优化处理,这里拼接是程序运行时进行的,所以会产生新串.
		System.out.println(s3 == s2);       //false: 
		System.out.println(s3.equals(s2));  //true		
	}
	private static void demo4() {
		//byte b = 3 + 4;						
		String s1 = "a" + "b" + "c";//由于"a","b","c"都是常量编译器会对其优化,编译后就变成了"abc"常量
		String s2 = "abc";
		System.out.println(s1 == s2); 	   //true		
		System.out.println(s1.equals(s2)); //true 		
	}
	private static void demo3() {
		String s1 = new String("abc");				
		String s2 = "abc";						
		System.out.println(s1 == s2); 	   //false		
		System.out.println(s1.equals(s2)); //true		
	}
	private static void demo2() {
			
		String s1 = new String("abc");	// 这句话创建了几个对象 	
		System.out.println(s1);		    // 2个对象
		
	}
	private static void demo1() {				
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 		//true			
		System.out.println(s1.equals(s2)); 	//true	
	}
}
