package day06.classTest;

/**
 * 输出九九乘法表
 * 
 * @author Ulric
 *
 */

public class ClassTest26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}

	// 输出九九乘法表
	public static void print() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "    ");
			}
			System.out.println();
		}
	}

}
