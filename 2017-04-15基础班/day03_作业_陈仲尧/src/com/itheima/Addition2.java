package com.itheima;

/**
 * 分析以下需求，并用代码实现：

 (1).按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数

 (2).每行输出5个满足条件的数，之间用空格分隔

 (3).如：9999 9988 9977 9966 9955    
 * @author Ulric
 *
 */

public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i = 9999; i >= 1000; i--) {
			
			int digit = i % 10;	// 个位
			int tensDigit = i / 10 % 10;	// 十位
			int hundredsDigit = i / 10 / 10 % 10;	// 百位
			int thousandsDigit = i / 10 / 10 / 10 % 10;	// 千位
			
			if(digit + hundredsDigit == tensDigit + thousandsDigit){	// 如果满足条件
				count++;
				System.out.print(i + " ");
				
				if(count != 0 && count % 5 == 0){	// 如果已经输出5个满足条件的数，则换行一次
					System.out.println();
				}// 此if语句不应放在外if语句以外
			}
			
			
		}
		System.out.println("\n满足条件的个数为：" + count + "个");
	}

}
