package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字小游戏
 * @author Ulric
 *
 */

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int rand = random.nextInt(100) + 1;
		
		System.out.println("请输入您要猜的数字(1-100)：");
		
		int guess = scanner.nextInt();
		
		while(guess != rand){	// 如果猜不中则循环输入
			if(guess > rand){
				System.out.println("您猜的数字大了！");
			}else if(guess < rand){
				System.out.println("您猜的数字小了！");
			}
			guess = scanner.nextInt();
		}
		
		System.out.println("恭喜您！猜中了！");
		 
		
	}

}
