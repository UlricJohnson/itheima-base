package com.itheima.test;

import java.util.Random;

/*
 3. 获取小于数组中”元素平均数”的元素,要求如下:
  1.定义String  getNums(int[] arr)静态方法,方法内要求完成 :
	获取指定数组arr中所有元素的平均数avg,并打印到控制台,
	返回元素为小于等于avg 的所有元素(元素间用逗号连接);
  2.定义main方法,方法内完成:
	(1)随机获取6个1~89之间(含1,89)整数,存入数组中;
	(2)传递arr 调用getNums方法,获取返回值并在控制台打印,要求返回值不以逗号结尾.
		参照格式:
		平均值为:  62
		数组元素有:
		1   29    68   95  93  88
		小于等于avg的所有元素分别是1,29
 */
public class TestAdditional03 {

	/*
	   2.定义main方法,方法内完成:
		(1)随机获取6个1~89之间(含1,89)整数,存入数组中;
		(2)传递arr 调用getNums方法,获取返回值并在控制台打印,要求返回值不以逗号结尾.
			参照格式:
			平均值为:  62
			数组元素有:
			1   29    68   95  93  88
			小于等于avg的所有元素分别是1,29
			
	  思路:
	  1. 定数组并动态初始化,数组的元素个数为6
	  2. 创建随机数对象,用于给数组的元素赋值
	  3. 遍历数组,并遍历的同时对数组的元素赋值
	  4. 在遍历数组时,使用随机数的nextInt(89)+1的方法获取1-89的随机数,存入数组
	  5.调用getNums方法,传入数字
	  6. 打印数组的元素
	  7. 打印小于平均数的值
	 */
	public static void main(String[] args) {
//		  1. 定数组并动态初始化,数组的元素个数为6
		int[] arr = new int[6];
//		  2. 创建随机数对象,用于给数组的元素赋值
		Random r = new Random();
//		  3. 遍历数组,并遍历的同时对数组的元素赋值
		for (int i = 0; i < arr.length; i++) {
//			  4. 在遍历数组时,使用随机数的nextInt(89)+1的方法获取1-89的随机数,存入数组
			arr[i] = r.nextInt(89)+1;
		}
//		  5.调用getNums方法,传入数字
		String str = getNums(arr);
//		  6. 打印数组的元素
		System.out.println("数组元素有:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
//		  7. 打印小于平均数的值
		System.out.println("小于等于avg的所有元素分别是"+str);
	}

/*
  1.定义String  getNums(int[] arr)静态方法,方法内要求完成 :
	获取指定数组arr中所有元素的平均数avg,并打印到控制台,
	返回元素为小于等于avg 的所有元素(元素间用逗号连接);
 
 思路:
  1. 由于要计算平均数,首先要计算总数; 定义变量,用于统计总数
  2. 遍历数组arr
  3. 对数组中元素进行累加
  4. 计算平均数
  5. 把平均数打印到控制台上
  6. 创建StringBuilder对象,用于拼接字串
  7. 遍历数组arr
  8. 如果元素<平均分,就将其追加到StringBuilder中
  9. 由于返回的元素不能以,逗号结尾,所以需要删除最后的逗号
  10. 把StringBuilder转换为String返回
*/
	public static String  getNums(int[] arr){
	//	  1. 由于要计算平均数,首先要计算总数; 定义变量,用于统计总数
		int sum = 0;
	//	  2. 遍历数组arr
		for (int i = 0; i < arr.length; i++) {
	//		  3. 对数组中元素进行累加
			sum += arr[i];
		}
	//	  4. 计算平均数
		int avg = sum / arr.length;
	//	  5. 把平均数打印到控制台上
		System.out.println("平均值为:"+avg);
	//	  6. 创建StringBuilder对象,用于拼接字串
		StringBuilder sb = new StringBuilder();
	//	  7. 遍历数组arr
		for (int i = 0; i < arr.length; i++) {
	//		 8. 如果元素<平均分,就将其追加到StringBuilder中	
			if(arr[i] < avg){
				sb.append(arr[i]+",");
			}
		}
	//	9.删除结尾的逗号
		sb.deleteCharAt(sb.length()-1);
	//	10. 把StringBuilder转换为String返回
		return sb.toString();
	}

}