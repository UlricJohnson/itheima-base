package com.itheima_02;

/**
 * 遍历二维数组
 * @author Ulric
 *
 */

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dyadicArray = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for (int i = 0; i < dyadicArray.length; i++) {
			for (int j = 0; j < dyadicArray[i].length; j++) {
				System.out.print(dyadicArray[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
