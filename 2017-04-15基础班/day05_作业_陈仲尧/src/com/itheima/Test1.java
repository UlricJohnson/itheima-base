package com.itheima;

/**
 * 分析以下需求，并用代码实现(每个小需求都需要封装成方法)
 * 
 * (1).求两个数据之和(整数和小数)
 * 
 * (2).判断两个数据是否相等(整数和小数)
 * 
 * (3).获取两个数中较大的值(整数和小数)
 * 
 * (4).获取两个数中较小的值(整数和小数)
 * 
 * (5).否能用一个方法实现3和4的两个功能
 * 
 * @author Ulric
 *
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// (1).求两个数据之和(整数和小数)
	public static int getSum(int a, int b) {
		return a + b;
	}

	public static double getSum(double a, double b) {
		return a + b;
	}

	// (2).判断两个数据是否相等(整数和小数)
	public static boolean equals(int a, int b) {
		return a == b;
	}

	public static boolean equals(double a, double b) {
		return a == b;
	}

	// (3).获取两个数中较大的值(整数和小数)
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}

	public static double getMax(double a, double b) {
		return a > b ? a : b;
	}

	// (4).获取两个数中较小的值(整数和小数)
	public static int getMin(int a, int b) {
		return a < b ? a : b;
	}

	public static double getMin(double a, double b) {
		return a < b ? a : b;
	}

	// (5).能否用一个方法实现3和4的两个功能
	public static int getMaxOrMin(int a, int b, boolean getMax) {
		if (getMax) {
			return a > b ? a : b;
		} else {
			return a < b ? a : b;
		}
	}

	public static double getMaxOrMin(double a, double b, boolean getMax) {
		if (getMax) {
			return a > b ? a : b;
		} else {
			return a < b ? a : b;
		}
	}
}
