package com.yc.java013test;

import javax.print.attribute.standard.Finishings;

public class Test1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		expand(a);//  
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}
	public static void expand(final int[] a) {
		int[] newArray = new int[a.length];
		// int[] newArray = new int[a.length*2 ];
		System.arraycopy(a, 0, newArray, 0, a.length);
		for (int i = 0; i < a.length; i++) {
			newArray[i] = 5 * i;
		}
		for (int i : newArray) {
			System.out.print(i + "\t");
		}
		System.out.println();
		//a = newArray;
		a[0]=22;
		// System.arraycopy(newArray, 0, a, 0, a.length);
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
