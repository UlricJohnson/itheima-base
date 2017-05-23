package com.itheima.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student[] aStudents = new Student[4];

		aStudents[0] = new Student("张三", '男');
		aStudents[1] = new Student("李四", '女');
		aStudents[2] = new Student("王五", '男');
		aStudents[3] = new Student("赵六", '女');

		adMan(aStudents);
	}

	// 将男生姓名添加到 man.txt中
	public static void adMan(Student[] stus) throws IOException {
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("man.txt"));
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].getSex() == '男') {
				bWriter.write(stus[i].getName());
				bWriter.newLine();
				bWriter.flush();
			}
		}
		bWriter.close();
	}

}
