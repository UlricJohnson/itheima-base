package day06.classTest;

/**
 * (1)定义一个int类型的一维数组，内容为{6,2,9,15,1,5,20,7,18}
 * 
 * (2)先将数组最大元素与最后一位元素进行交换,再将最小元素与第一位元素进行交换，并打印数组
 * 
 * @author Ulric
 *
 */

public class ClassTest27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 2, 9, 15, 1, 5, 20, 7, 18 };

		// 将数组最大元素与最后一位元素进行交换
		int max = getMax(arr);
		int maxIndex = getIndex(arr, max);
		int temp = arr[arr.length - 1];
		arr[arr.length - 1] = max;
		arr[maxIndex] = temp;

		// 将最小元素与第一位元素进行交换
		int min = getMin(arr);
		int minIndex = getIndex(arr, min);
		temp = arr[0];
		arr[0] = min;
		arr[minIndex] = temp;
		
		//打印数组
		printArr(arr);
	}

	// 获取数组最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// 获取数组最小值
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// 输出数组
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	// 获取元素在数组中的索引，查找失败返回-1
	public static int getIndex(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
