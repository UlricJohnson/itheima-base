package com.itheima02;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader类read()方法逐个字符读取
 */

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("fr.txt");

		int ch;
		while ((ch = fReader.read()) != -1) {
			System.out.print((char) ch);
		}
		fReader.close();
	}

}
