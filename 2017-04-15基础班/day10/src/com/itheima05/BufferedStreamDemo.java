package com.itheima05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("bw2.txt"));
//		for (int i = 0; i < 10; i++) {
//			bWriter.write("hello" + i);
//			bWriter.newLine();
//		}
//		bWriter.close();

		BufferedReader bReader = new BufferedReader(new FileReader("myBr.txt"));
		String line;
		while ((line = bReader.readLine()) != null) {
			System.out.println(line);
		}
		bReader.close();
	}

}
