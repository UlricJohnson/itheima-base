package com.itheima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader(".\\src\\com\\itheima\\data.txt"));
		ArrayList<Student> stuList = new ArrayList<>();

		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			String[] datas = readLn.split(",");
			Student student = new Student();
			student.setId(datas[0]);
			student.setName(datas[1]);
			student.setAge(datas[2]);
			student.setAddress(datas[3]);
			stuList.add(student);
		}
		bReader.close();

		System.out.println("学号\t姓名\t年龄\t居住地址");
		for (int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
		}

	}

}
