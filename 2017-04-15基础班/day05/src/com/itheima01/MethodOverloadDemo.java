package com.itheima01;

/**
 * ·½·¨ÖØÔØ
 * @author Ulric
 *
 */

public class MethodOverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compare((byte)10, (byte)20));
		
		System.out.println(compare((short)10, (short)20));
		
		System.out.println(compare((int)10, (int)20));
		
		System.out.println(compare((long)10, (long)20));
	}

	// byte
	public static boolean compare(byte a, byte b) {
		System.out.print("compare byte----");
		return a == b;
	}

	// short
	public static boolean compare(short a, short b) {
		System.out.print("compare short----");
		return a == b;
	}

	// int
	public static boolean compare(int a, int b) {
		System.out.print("compare int----");
		return a == b;
	}

	// long
	public static boolean compare(long a, long b) {
		System.out.print("compare long----");
		return a == b;
	}

}
