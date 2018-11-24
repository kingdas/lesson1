package com.yc.java004function;

public class Test {

	public static void main(String[] args) {
		// 方法：先定义，后使用
		// 定义：方法签名（返回值类型+方法名+参数(形参)列表）+方法体｛｝
		//
		// Test t=new Test();
		// int n = t.abs(9);
		// System.out.println(n);
		// ////////////////////////////
		// int n = abs(-8);// 实参
		// System.out.println(n);
		// ////////////////////////////

		// int a = 5, b = 8;
		// System.out.println("a=" + a + ",b=" + b);
		// change(a, b);
		// System.out.println("a=" + a + ",b=" + b);
		// 形参为基本数据类型时，形参的改变不会影响实参
		// 形参为引用类型时，形参的改变会影响实参
		// ///////////////////////////////
		// System.out.println(3 + 4 + "java" + 3 + 4);
		// ///////////////////////////////
		// int[] a = { 5, 8 };
		// System.out.println("a[0]=" + a[0] + ",a[1]=" + a[1]);
		// change(a);
		// System.out.println("a[0]=" + a[0] + ",a[1]=" + a[1]);
		// // ///////////////////////////////
		//
		// int n = 17;
		// boolean b = isPrime(n);
		// System.out.println(b);
		// ///////////////////////////////

		int n = 17;
		if (isPrime(n)) {
			System.out.println(n + "是素数");
		} else {
			System.out.println(n + "不是素数");
		}

	}

	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void change(int[] a) {
		a[0] = a[0] ^ a[1];
		a[1] = a[0] ^ a[1];
		a[0] = a[0] ^ a[1];
	}

	static void change(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}

	/**
	 * 求绝对值
	 * 
	 * @param n
	 *            参数
	 * @return 返回绝对值
	 */
	static int abs(int n) {
		if (n < 0) {
			return -1 * n;
		}
		return n;// 返回值；方法调用结束
	}
}
