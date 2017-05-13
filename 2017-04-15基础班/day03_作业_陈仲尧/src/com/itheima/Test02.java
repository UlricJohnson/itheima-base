package com.itheima;

/**
 * (1).珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。

     (2).请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 * @author Ulric
 *
 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double thickness = 0.0001;	// 纸的厚度
		double heightOfQomolangma = 8848;	// 珠峰的高度
		int count = 0;	// 统计折叠次数
		
		while(thickness < heightOfQomolangma){
			thickness *= 2;
			count++;
		}
		System.out.println("需要折叠" + count + "次");
	}

}
