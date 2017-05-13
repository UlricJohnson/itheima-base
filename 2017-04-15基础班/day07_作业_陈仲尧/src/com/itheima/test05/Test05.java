package com.itheima.test05;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.setName("周志鹏");
		teacher.setAge(30);
		teacher.setContent("Java基础中面向对象");
		teacher.eat();
		teacher.teach();

		Student student = new Student("韩光", 18, "面向对象");
		student.eat();
		student.study();
	}

}
