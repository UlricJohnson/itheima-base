package com.itheima.test4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
4.在当前项目根目录下有一个“qq.txt文件”里面存放的内容如下
 （项目根目录,假设qq号的长度最大为11位）
	58833442234
	12345
	67891
	12347809933
	98765432102
	67891
	12347809933	
	a.将该文件里面的所有qq号都存放在ArrayList中
	b.将ArrayList中重复元素删除,遍历删除重复元素后的ArrayList集合
 */

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader("qq.txt"));
		ArrayList<String> strArrList = new ArrayList<String>();

		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			strArrList.add(readLn);
		}
		System.out.println("原集合：" + strArrList);

		strArrList = deleteRepeated(strArrList);

		
		for (int i = 0; i < strArrList.size(); i++) {
			System.out.println(strArrList.get(i));
		}
	}

	// 删除集合中重复的元素
	public static ArrayList<String> deleteRepeated(ArrayList<String> arrList) {
		ArrayList<String> newArrList = new ArrayList<String>();
		for (int i = 0; i < arrList.size(); i++) {
			if (!newArrList.contains(arrList.get(i))) {
				newArrList.add(arrList.get(i));
			}
		}
		return newArrList;
	}

}
