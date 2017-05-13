package com.itheima06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> arrlist = new ArrayList<>();

		arrlist.add("hello");
		arrlist.add("world");
		arrlist.add("java");

		BufferedWriter bWriter = new BufferedWriter(new FileWriter("arrListToFile.txt"));

		for (int i = 0; i < arrlist.size(); i++) {
			bWriter.write(arrlist.get(i));
			bWriter.newLine();
			bWriter.flush();
		}

		bWriter.close();
	}

}
