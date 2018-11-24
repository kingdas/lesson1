package com.yc.java002test;

public class Test {

	public static void main(String[] args) {
		// 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
		// 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
		// int a = 2, n = 5, sum = 0;
		// int item = 0;
		// for (int i = 0; i < n; i++) {
		// item = item * 10 + a;
		// sum += item;
		// System.out.println(item + "," + sum);
		//
		// }
		// System.out.println(sum);
		// //////////////////////////////////
		// 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。  
		// int a = 2, b = 1, ta;
		// double item, sum = 0;
		// for (int i = 0; i < 20; i++) {
		// item = 1.0 * a / b;
		// sum += item;
		// System.out.println(a + "," + b + "," + item);
		// ta = a;
		// a = a + b;
		// b = ta;
		// }
		// System.out.println(sum);
		// /////////////////////////////////////
		// 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
		// 60-89分之间的用B表示，60分以下的用C表示。
		// int score = 59;
		// if (score >= 90) {
		// System.out.println('A');
		// } else if (score >= 60) {
		// System.out.println('B');
		// } else {
		// System.out.println('C');
		// }
		// /////////////////////////////
		// int score = 70;
		// switch (score / 10) {
		// case 10:
		// case 9:
		// System.out.println('A');
		// break;
		// case 8:
		// case 7:
		// case 6:
		// System.out.println('B');
		// break;
		// default:
		// System.out.println('C');
		// break;
		// }
		// //////////////////////////////////////
		// 输入某年某月某日，判断这一天是这一年的第几天？
		int y = 2018, m = 7, d = 25;

	}

}
