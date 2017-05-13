package com.itheima;

public class Test08_02 {
	public static void main(String[] args) {
        int x = 1, y = 1;
        if(x++ == 1 | ++y == 1) {
                 x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);	// x=7,y=2
        int a = 1, b = 1;
        if(a++ == 1 || ++b == 1) {
                 a = 7;
        }
        System.out.println("a=" + a + ",b=" + b);   // a=7,b=1
	}
}
