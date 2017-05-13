package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，然后剩余的8位评委的分数进行平均，就是该选手的最终得分。求某选手的得分.10个分数如下 {7,9,5,8,7,8,8,10,9,6}
   	提示：1. 使用数组存储10位评委打的分数； 
        2. 使用随机数生成0-100之间的分数   
		3. 找到最高分和最低分, 
		4. 把10个人的分数和, 在减去最高和最低, 再除以8就可以得到这个歌手的评分。
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] scores = new int[10];
		int max = 0;	// 在本题中max可以初始化为0
		int sum = 0;
		
		System.out.println("该选手获得的评分分别为：");
		
		for (int i = 0; i < scores.length; i++) {	// 随机生成[0,10]之间的分数
			scores[i] = random.nextInt(11);	
//			if(scores[i] < min){
//				min = scores[i];
//			}
			if(scores[i] > max){	// 选出最大值
				max = scores[i];
			}
			sum += scores[i];	// 累加
			System.out.print(scores[i] + "  ");
		}
		
		// 选出最小值
		int min = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] < min){
				min = scores[i];
			}
		}
		
		System.out.println("\n总分为：" + sum + "\n去掉最高分 " + max + " 和最低分 " + min + " 后，该选手的最终评分为：" + (sum-max-min) * 1.0 / (scores.length - 2));
		
		
		
	}

}
