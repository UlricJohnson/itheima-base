package com.itheima;

public class TestStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo student = new StudentDemo();
		System.out.println("student: " + student);
		System.out.println("------------------");

		System.out.println("student's name: " + student.name + "\tage:" + student.age);

		student.name = "Ulric";
		student.age = 21;

		System.out.println("student's name: " + student.name + "\tage:" + student.age);

	}

}
