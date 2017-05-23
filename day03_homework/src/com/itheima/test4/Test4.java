package com.itheima.test4;

public class Test4 {

	public static void main(String[] args) {
		Student student1 = new Student("张三", 20);
		Student student2 = new StudentCanPlayBasketball("李四", 21);

		// 使用多态的方式调用学习的方法
		student1.study();
		student2.study();

		// 调用打篮球的功能
		StudentCanPlayBasketball stu = (StudentCanPlayBasketball) student2;
		stu.playBasketball();
	}

}
