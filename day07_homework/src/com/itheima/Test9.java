package com.itheima;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("101-200之间的素数有：");
		int count = showPrimeBetween(101, 200);
		System.out.println("\n共计" + count + "个");
	}

	// 输出m和n之间的所有素数，并返回个数
	public static int showPrimeBetween(int m, int n) {
		int count = 0;
		for (int i = m; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
		return count;
	}

	// 判断是否为素数
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
