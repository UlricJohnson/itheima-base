package com.itheima.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> strArrList = new ArrayList<>();

		addPlayerMsg(strArrList);

		printPlayerName(strArrList);

	}

	// 读取文件并将球员信息添加至集合中
	public static void addPlayerMsg(ArrayList<String> aList) throws IOException {
		BufferedReader bReader = new BufferedReader(new FileReader("player.txt"));
		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			aList.add(readLn);
		}
	}

	// 遍历球员姓名
	public static void printPlayerName(ArrayList<String> aList) throws IOException {
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i).split(",")[1]);
		}
	}

}
