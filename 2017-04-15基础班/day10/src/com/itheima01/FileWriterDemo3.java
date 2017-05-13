package com.itheima01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 1.void write(String str):写入str字符串数据
 * 2.void write(String str,int index,int len):写入str字符串中从index索引开始的len个字符
 * 3.void write(int ch):写入ch字符
 * 4.void write(char[] chs):逐个写入chs字符数组元素
 * 5.void write(char[] chs,int index,int len):写入chs字符数组中从index索引开始的len个字符
 */

public class FileWriterDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fWriter = new FileWriter("test2.txt");// 写到项目根目录

		// 1.void write(String str)
		fWriter.write("HelloWorld!");
		fWriter.write("\r\n-----------------\r\n");// windows中换行

		// 2.void write(String str,int index,int len)
		fWriter.write("HelloWorld!", 0, 11);
		fWriter.write("\r\n");
		fWriter.write("HelloWorld!", 0, 5);
		fWriter.write("\r\n-----------------\r\n");

		// 3.void write(int ch)
		fWriter.write('A');
		fWriter.write("\r\n");
		fWriter.write(97);
		fWriter.write("\r\n-----------------\r\n");

		// 4.void write(char[] chs)
		char[] chs = { 'c', 'h', 'a', 'r', 's', 'b', 'u', 'f' };
		fWriter.write(chs);
		fWriter.write("\r\n-----------------\r\n");

		// 5.void write(char[] chs,int index,int len)
		fWriter.write(chs, 0, 5);
		fWriter.write("\r\n");
		fWriter.write(chs, 1, 3);

		fWriter.close();
	}

}
