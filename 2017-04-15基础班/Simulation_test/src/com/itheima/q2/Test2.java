package com.itheima.q2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 2. 定义类: Test类中定义 main()方法,依次完成以下要求:
 * 		2.1  创建4个Phone对象, 4个对象属性分别是:  “MeiZu”  800;  “Mi”  750;  “iPhone”   5000;  “HaiWei”   1000;
 *		2.2 创建一个ArrayList 集合, 将上面的4个对象添加入该集合里;
 *		2.3 获取集合中元素品牌为 ”M” 开头的所有手机价格总和,  并在控制台打印输出;
 *		2.4 提示键盘录入一个数,将 “Mi” 的价格修改为这个数,再把小于这个数的手机价格删除,统计删除的个数,在控制台打印修改后的所有对象的属性值及删除的元素个数.
 *		参考格式如下:
 *		品牌为 ”M” 开头的所有手机有:
 *		品牌是: MeiZu	价格为:800
 *		品牌是: Mi	价格为:750
 *		品牌为 ”M” 开头的所有手机价格总和是1550 
 *		请输入一个整数(价格):
 *		760
 *		删除的元素的个数: 1
 *  	MeiZu:500     iPhone:5000     HuaWei:1000
 */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Phone> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Phone mzPhone = new Phone("MeiZu", 800);
		Phone miPhone = new Phone("Mi", 750);
		Phone iPhone = new Phone("iPhone", 5000);
		Phone hwPhone = new Phone("HuaWei", 1000);

		arrayList.add(mzPhone);
		arrayList.add(miPhone);
		arrayList.add(iPhone);
		arrayList.add(hwPhone);

		// 获取集合中元素品牌为 ”M” 开头的所有手机价格总和, 并在控制台打印输出;
		System.out.println("品牌为 ”M” 开头的所有手机有:");
		int sumOfPrice = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			Phone phone = arrayList.get(i);
			if (phone.getBrand().startsWith("M")) {
				System.out.println("品牌是：" + phone.getBrand() + "  价格为：" + phone.getPrice());
				sumOfPrice += phone.getPrice();
			}
		}
		System.out.println("品牌为 ”M” 开头的所有手机价格总和是" + sumOfPrice);

		// 输入一个数，并把Mi的价格修改为这个数
		System.out.println("请输入一个整数(价格):");
		int tempPrice = scanner.nextInt();
		miPhone.setPrice(tempPrice);

		// 把价格小于tempPrice的手机删除并统计个数
		int count = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			Phone phone = arrayList.get(i);
			if (phone.getPrice() < tempPrice) {
				arrayList.remove(i);
				i--;
				count++;
			}
		}

		System.out.println("删除的元素的个数:" + count);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i).getBrand() + ":" + arrayList.get(i).getPrice() + "  ");
		}

	}

}
