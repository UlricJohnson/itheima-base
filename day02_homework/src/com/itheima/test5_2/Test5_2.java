package com.itheima.test5_2;

public class Test5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setName("李彦宏");

		Teacher teacher = new Teacher();
		teacher.setAge(35);
		teacher.setName("马云");

		teacher.eat();
		student.eat();
		teacher.teach();
		student.study();

	}

}
