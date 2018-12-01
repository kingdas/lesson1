package com.yc.java010test2;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// 百元买百鸡
		// 公鸡5元一只，母鸡3元一只，小鸡一元三只
		// long t = new Date().getTime();
		// int c = 0;
		// for (int i = 0; i <= 100; i++) {
		// for (int j = 0; j <= 100; j++) {
		// for (int k = 0; k <= 100; k++) {
		// c++;
		// if (k % 3 == 0 && i + j + k == 100
		// && i * 5 + j * 3 + k / 3 == 100) {
		// System.out.println(i + "," + j + "," + k);
		// }
		// }
		// }
		// }
		// System.out.println(c);//1030301
		// System.out.println(new Date().getTime() - t);
		// // //////////////////////////////////////
		// long t = new Date().getTime();
		// int c = 0;
		// for (int i = 0; i <= 20; i++) {
		// for (int j = 0; j <= 33; j++) {
		// for (int k = 0; k <= 100; k++) {
		// c++;
		// if (k % 3 == 0 && i + j + k == 100
		// && i * 5 + j * 3 + k / 3 == 100) {
		// System.out.println(i + "," + j + "," + k);
		// }
		// }
		// }
		// }
		// System.out.println(c);//72114
		// // //////////////////////////////////////
		// long t = new Date().getTime();
		// int c = 0;
		// int k;
		// for (int i = 0; i <= 20; i++) {
		// for (int j = 0; j <= 33; j++) {
		// k = 100 - i - j;
		// c++;
		// if (k % 3 == 0 && i * 5 + j * 3 + k / 3 == 100) {
		// System.out.println(i + "," + j + "," + k);
		// }
		// }
		// }
		// System.out.println(c);//714
		// //////////////////////////////////////
		int c = 0;
		int j, k;
		for (int i = 0; i <= 20; i++) {
			c++;
			if (7 * i % 4 != 0) {
				continue;
			}
			j = 25 - 7 * i / 4;
			if (j < 0) {
				continue;
			}
			k = 100 - i - j;
			System.out.println(i + "," + j + "," + k);
		}
		System.out.println(c);// 21
	}
}
