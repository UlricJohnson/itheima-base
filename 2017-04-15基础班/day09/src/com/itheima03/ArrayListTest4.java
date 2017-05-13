package com.itheima03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 创建存储Student的集合，键盘录入数据后添加到集合中
 * 
 * @author Ulric
 *
 */

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<>();

		addStudent(arrayList);
		addStudent(arrayList);
		addStudent(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getName() + "----" + arrayList.get(i).getAge());
		}
	}

	public static void addStudent(ArrayList<Student> arrListStu) {
		System.out.println("请输入学生姓名：");
		String stuName = new Scanner(System.in).nextLine();

		System.out.println("请输入学生年龄：");
		String stuAge = new Scanner(System.in).nextLine();

		arrListStu.add(new Student(stuName, stuAge));
	}

}
