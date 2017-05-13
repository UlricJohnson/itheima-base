package com.itheima05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader("FileWriterDemo.java"));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("Copy.java"));

		String line;
		while ((line = bReader.readLine()) != null) {
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
		bReader.close();
	}

}
