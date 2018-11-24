package com.yc.java008encapsulate;

public class MethodOverload {
	// 方法的重载：在类中，同名的方法叫方法的重载；
	// 前提：在同一个类中，方法名相同参数列表（个数，类型，顺序）不同,仅返回值类型不同不能构成方法的重载

	// int add(int a, int b) {
	// return a + b;
	// }

	// long add(int a, int b) {
	// System.out.println(".");
	// return a + b;
	// }
	//
	long add(int a, long b) {
		System.out.println("..");
		return a + b;
	}

	long add(long a, int b) {
		System.out.println("...");
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		MethodOverload mo = new MethodOverload();
		// mo.add(a, b);

	}
}
