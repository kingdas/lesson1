package com.yc;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// int[] a = new int[10];
		// init(a);
		// print(a);
		// sort(a);
		// print(a);
		// ///////////////////

		int x = fun(5);
		System.out.println(x);

	}

	public static int fun(int n) {
		if (n == 1) {// 递归调用一定要有结束条件
			return 1;
		}
		return n * fun(n - 1);// 5*fun(4);5*4*fun(3);//5*4*3*fun(2);//5*4*3*2*fun(1);//5*4*3*2*1);
	}

	// 冒泡排序
	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j] ^ a[j + 1];
					a[j] = a[j] ^ a[j + 1];
				}
				// print(a);
			}
		}
	}

	public static void print(int[] a) {
		for (int t : a) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

	public static void init(int[] a) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
	}

}
