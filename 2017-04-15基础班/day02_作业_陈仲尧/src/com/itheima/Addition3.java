package com.itheima;

/**
 * 3. AB之间距离5km，A速度为1.2km/h，B速度为2km/h，求B多久能赶上A。
 * @author Ulric
 *
 */

public class Addition3 {
	public static void main(String[] args) {
		int distant = 5;
		float speedA = 1.2F;
		float speedB = 2F;
		double time = distant / (speedB - speedA);	// 小数形式，以小时为单位
		System.out.println("B追上A需花时：" + (int)(time) + "小时" + (int)((time - (int)(time))*60) + "分钟");
	}
}
