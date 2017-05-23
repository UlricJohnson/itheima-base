package com.itheima.test3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
3.从键盘接受多个int型的整数,直到用户输入end结束,
       要求:把所有的整数按倒序写到D:\\number.txt中,(要求使用缓冲流)
 */

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> numsArrList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入整数，输入\"end\"结束：");
		// String input = scanner.nextInt() + "";// 输入整数并转为String类型
		String input = scanner.nextLine();

		// 循环输入并添加到集合中
		while (!input.equals("end")) {
			numsArrList.add(input);
			System.out.println("请继续输入：");
			// input = scanner.nextInt() + "";
			input = scanner.nextLine();
		}

		// 倒序输出
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("D:\\number.txt"));
		for (int i = numsArrList.size() - 1; i >= 0; i--) {
			bWriter.write(numsArrList.get(i));
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
	}

}
