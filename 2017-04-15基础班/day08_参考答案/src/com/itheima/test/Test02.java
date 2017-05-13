package com.itheima.test;

public class Test02 {

	/*
	 * 第二题：分析以下需求，并用代码实现
	1.定义如下方法public static String getPropertyGetMethodName(String property)
		功能描述: name->getName age->getAge  price->getPrice   helloWorld->getHelloWorld
			(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
			(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
	2.定义如下方法public static String getPropertySetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的set方法的名字
			(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"setName"
	 */
	public static void main(String[] args) {
		String getMethod = getPropertyGetMethodName("name");
		System.out.println(getMethod);
		
		String setMethod = getPropertySetMethodName("name");
		System.out.println(setMethod);
	}
	
	//获取返回方法名称
	public static String getPropertyGetMethodName(String property) {
		//使用get先拼接，加上传入字符串的第一个字母变成大写，加上传入字符串的从第二个开始所有的内容
		String str = "get" + property.substring(0, 1).toUpperCase() + property.substring(1);
		return str;
	}
	
	//获取设置方法名称
	public static String getPropertySetMethodName(String property) {
		//使用set先拼接，加上传入字符串的第一个字母变成大写，加上传入字符串的从第二个开始所有的内容
		String str = "set" + property.substring(0, 1).toUpperCase() + property.substring(1);
		return str;
	}
}
