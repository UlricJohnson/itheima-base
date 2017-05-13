package com.itheima04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("bw.txt"));
		bWriter.write("hello");
		bWriter.close();

		BufferedReader bReader = new BufferedReader(new FileReader("FileWriterDemo.java"));
		// int ch;
		// while ((ch = bReader.read()) != -1) {
		// System.out.print((char) ch);
		// }
		char[] chs = new char[1024];
		int len;
		while ((len = bReader.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}
		bReader.close();
	}

}
