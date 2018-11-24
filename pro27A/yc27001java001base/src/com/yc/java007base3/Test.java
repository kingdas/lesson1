package com.yc.java007base3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// // 程序结构：顺序、选择、循环
		// char k = 3;
		// // char k = 'a';
		// switch (k) {// 多路选择;
		// // key：1.5以前只能是int类型，1.5以后可以是枚举，1.7以后可以是String
		// case 1:
		// System.out.println(1);
		// System.out.println("..");
		// break;// 跳出switch语句
		// case 3:
		// System.out.println(3);
		// System.out.println("**");
		// // break;
		// case 4:
		// System.out.println(4);
		// System.out.println("--");
		// break;
		// default:
		// System.out.println(99);
		// break;
		// }
		// System.out.println("888888888888");
		// ////////////////////////////////
		// for,while,foreach
		// do-while

		// int n = 15;
		// int sum = 0;
		// while (n < 15) {
		// sum += n;
		// n++;
		// }
		// System.out.println(sum);

		// int n = 15;
		// int sum = 0;
		// do {// 循环体至少执行一次；当第一次执行时条件成立的话while和do-while没区别
		// sum += n;
		// n++;
		// } while (n < 15);
		// System.out.println(sum);
		// ///////////////////////////
		// 数组
		// int[] a = { 3, 4, 5 };
		// boolean[] b = { true, false, false };
		// boolean[] c = new boolean[2];
		// System.out.println(c[0]);
		// System.out.println(b[2]);
		// // 默认值：布类型数组元素默认值为：false;
		// // double,float数组元素默认值为0.0
		// // byte,short,int,long数组元素默认值为0
		// // char 数组元素默认值为0
		// int x;
		// System.out.println(x);
		// /////////////////////
		// String[] ss;
		// Random[] rs;
		// Math[] ms;
		// /////////////////////
		// int[] a = { 1, 2, 3 };
		// int[] b = { 1, 2, 1, 4 };
		// int[][] c = { a, b };// 二维数组
		// // 交错数组
		// for (int i = 0; i < c.length; i++) {
		// for (int j = 0; j < c[i].length; j++) {
		// System.out.print(c[i][j] + " ");
		// }
		// System.out.println();
		// }
		// // /////////////////////
		// Random r = new Random();
		// int[] a = new int[10];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = r.nextInt(100);
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// System.out.println();
		// int min, minIndex;
		// min = a[0];
		// minIndex = 0;
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// System.out.println(minIndex);
		// // /////////////////////
		// Random r = new Random();
		// int[] a = new int[10];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = r.nextInt(100);
		// }
		// // i=3;
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// System.out.println();
		// int min, minIndex, tmp;// 变量的作用域
		// // tmp<==>temp;flag<==>flg; LV
		// {
		// min = a[0];
		// minIndex = 0;
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// tmp = a[0];
		// a[0] = a[minIndex];
		// a[minIndex] = tmp;
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// /////////////////////
		// Random r = new Random();
		// int[] a = new int[10];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = r.nextInt(100);
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// System.out.println();
		// int min, minIndex, tmp;// 变量的作用域
		// for (int j = 0; j < a.length - 1; j++) {// 选择排序
		// min = a[j];
		// minIndex = j;
		// for (int i = j; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// tmp = a[j];
		// a[j] = a[minIndex];
		// a[minIndex] = tmp;
		// }
		// for (int t : a) {
		// System.out.print(t + " ");
		// }
		// ////////////////////////////////
		// long l=12345678901L;
		// double d=12345678901D;
		// byte b=128;
		// ////////////
		// int a = 010;// 八进制数
		// int b = 0x10;// 十六进制数
		// System.out.println(a);
		// System.out.println(b);
		int a = 9;
		char[] c = { 'a', 'b', ' ' };
		String s = "def";

		xxx(a, c, s);

		System.out.println(a);
		System.out.println(c);
		System.out.println(s);

	}

	static void xxx(int a, char[] c, String s) {
		a += 5;
		c[0] = 'x';
		s += 'x';
	}

}
