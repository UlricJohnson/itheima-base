package com.itheima;

/**
 * 2、 分析以下需求，并用代码实现
 * 
 * (1).定义如下方法public static String getPropertyGetMethodName(String property)
 * 
 * 功能描述:
 * 
 * a.该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
 * 
 * b.如：用户调用此方法时 若传入的实参是"name",该方法的返回值为"getName"，若传入的实参为"age"，该方法的返回值为"getAge"
 * 
 * (2).定义如下方法public static String getPropertySetMethodName(String property)
 * 
 * 功能描述:
 * 
 * a.该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的set方法的名字
 * 
 * b.如：用户调用此方法时,若给定的参数为"name",那么该方法的返回值为"setName"，若给定的参数为"age"，那么方法的返回值为："setAge"
 * 
 * @author Ulric
 *
 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPropertyGetMethodName("name"));
		System.out.println(getPropertySetMethodName("age"));
	}

	// 如：用户调用此方法时 若传入的实参是"name",该方法的返回值为"getName"，若传入的实参为"age"，该方法的返回值为"getAge"
	public static String getPropertyGetMethodName(String property) {
		return "get" + property.substring(0, 1).toUpperCase() + property.substring(1);
	}

	public static String getPropertySetMethodName(String property) {
		return "set" + property.substring(0, 1).toUpperCase() + property.substring(1);
	}
}
