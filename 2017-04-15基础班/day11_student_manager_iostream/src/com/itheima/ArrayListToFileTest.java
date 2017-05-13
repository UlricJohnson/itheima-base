package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> stuList = new ArrayList<>();
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(".\\src\\com\\itheima\\data.txt"));

		addStudent(stuList);
		addStudent(stuList);
		addStudent(stuList);

		for (int i = 0; i < stuList.size(); i++) {
			StringBuilder sBuilder = new StringBuilder();
			Student student = stuList.get(i);
			sBuilder.append(student.getId()).append(",").append(student.getName()).append(",").append(student.getAge())
					.append(",").append(student.getAddress());
			bWriter.write(sBuilder.toString());
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
	}

	public static void addStudent(ArrayList<Student> stuList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学号：");
		String id;
		// boolean isExist = false;//学号是否已存在
		while (true) {
			boolean isExist = false;// 应该把判断变量放在循环里面
			id = scanner.nextLine();
			for (int i = 0; i < stuList.size(); i++) {
				if (stuList.get(i).getId().equals(id)) {// 如果学号已经存在，则更改标志变量并退出遍历循环
					// System.out.println("学号已存在，请重新输入：");
					isExist = true;
					break;// 跳出遍历集合的循环
				}
			}
			if (isExist) {
				System.out.println("学号已存在，请重新输入：");
			} else {
				break;// 跳出外层输入的循环
			}
		}

		System.out.println("请输入姓名：");
		String name = scanner.nextLine();
		System.out.println("请输入年龄：");
		String age = scanner.nextLine();
		System.out.println("请输入居住地址：");
		String address = scanner.nextLine();

		stuList.add(new Student(id, name, age, address));
		System.out.println("添加成功！");
	}

}
