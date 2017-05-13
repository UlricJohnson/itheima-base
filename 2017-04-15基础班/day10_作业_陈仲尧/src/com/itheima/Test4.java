package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现
         实现一个验证码小程序，要求如下：
       (1). 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
       (2). 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
 */

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("data.txt"));

		// 输入验证码存在集合中
		System.out.println("请输入3个验证码：");
		// String input = scanner.next();
		// while (input != null) {
		// aList.add(input);
		// input = scanner.next();
		// }
		for (int i = 0; i < 3; i++) {
			aList.add(scanner.next());
			// input = scanner.next();
		}

		// 把验证码写入文件
		for (int i = 0; i < aList.size(); i++) {
			bWriter.write(aList.get(i));
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();

		BufferedReader bReader = new BufferedReader(new FileReader("data.txt"));
		System.out.println("请输入需要验证的验证码：");
		String toBeChecked = scanner.next();
		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			if (toBeChecked.equals(readLn)) {// 如果输入的验证码匹配
				System.out.println("验证成功");
				return;
			}
		}
		System.out.println("验证失败");
		bReader.close();

	}

}
