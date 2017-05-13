package com.itheima01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 使用“\”需要转义
		FileWriter fWriter = new FileWriter("F:\\黑马java63期文件\\基础班文件——李德山\\上课视频资料\\day10\\test.txt");

		// 往文件写入内容
		fWriter.write("你好，IO流");// 这一步只是将内容写到内存缓冲区

		fWriter.flush();// 需要调用此方法把缓冲区中的内容写到文件中

		// 释放资源
		fWriter.close();// 如果后面还有待执行代码，但没有取消fWriter对象与文件的关联，则在程序结束前将不能对文件进行操作

		// while (true) {
		// }

	}

}
