package com.itheima.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 2.java写一个程序，实现从文件中读出文件内容，并将其打印在屏幕当中，并标注上行号
 */

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader(".\\src\\com\\itheima\\test2\\text.txt"));
		String readLn;
		int row = 1;
		while ((readLn = bReader.readLine()) != null) {
			System.out.println(row++ + "--" + readLn);
		}
	}

}
