package com.itheima01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 追加写入数据：(构造函数)
 * 		FileWriter(String fileName, boolean append)
 */

public class FileWriterDemo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// FileWriter fWriter = new FileWriter("test3.txt");
		FileWriter fWriter = new FileWriter("test3.txt", true);

		for (int i = 0; i < 10; i++) {
			fWriter.write("hello" + i + "\r\n");
		}

		fWriter.close();
	}

}
