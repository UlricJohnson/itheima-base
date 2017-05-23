package com.itheima.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
1.用代码实现以下需求
	(1)有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
	(2)打印格式：
		to=3
		think=1
		you=2
		//........
	(3)按照上面的打印格式将内容写入到D:\\count.txt文件中(要求用缓冲流)
 */

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String string = "If you want to change your fate I think you must come to the dark horse to learn java";
		String[] strings = string.split(" ");

		// ArrayList<String> strArrList = new ArrayList<String>();// 存放子字符串
		ArrayList<CountSubStr> cArrList = new ArrayList<CountSubStr>();// 统计strArrList中对应位置的子串出现的次数

		for (int i = 0; i < strings.length; i++) {
			if (!contains(cArrList, strings[i])) {// 集合中不存在包含该子串的对象
				// strArrList.add(strings[i]);
				cArrList.add(new CountSubStr(strings[i]));// 创建内容为该子串的对象(默认次数为1)并添加到集合
			} else {// 集合中存在包含该子串的对象，则令该对象的times参数自增1
				CountSubStr c = cArrList.get(getIndex(cArrList, strings[i]));
				c.setTimes(c.getTimes() + 1);
			}
		}

		BufferedWriter bWriter = new BufferedWriter(new FileWriter("D:\\count.txt"));
		for (int i = 0; i < cArrList.size(); i++) {
			// System.out.println(cArrList.get(i).getContent() + "=" +
			// cArrList.get(i).getTimes());
			bWriter.write(cArrList.get(i).getContent() + "=" + cArrList.get(i).getTimes());
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
	}

	// 获取内容为指定字符串的对象的索引
	public static int getIndex(ArrayList<CountSubStr> cArrList, String str) {
		for (int i = 0; i < cArrList.size(); i++) {
			if (cArrList.get(i).getContent().equals(str)) {
				return i;
			}
		}
		return -1;// 不存在则返回-1
	}

	// 判断集合中是否存在内容为指定字符串的对象
	public static boolean contains(ArrayList<CountSubStr> cArrList, String str) {
		for (int i = 0; i < cArrList.size(); i++) {
			if (cArrList.get(i).getContent().equals(str)) {// 如果对象中的字符串内容相匹配则返回true
				return true;
			}
		}
		return false;
	}

}
