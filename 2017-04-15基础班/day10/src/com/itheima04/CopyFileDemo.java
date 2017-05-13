package com.itheima04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 缓冲流复制文件
 */

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader("FileWriterDemo.java"));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("Copy.java"));

		char[] chs = new char[1024];
		int len;
		while ((len = bReader.read(chs)) != -1) {
			bWriter.write(chs, 0, len);
		}

		bReader.close();
		bWriter.close();
	}

}
