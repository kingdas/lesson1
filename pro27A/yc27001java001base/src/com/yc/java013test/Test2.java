package com.yc.java013test;

public class Test2 {

	public static void main(String[] args) {
		char i, j, k;// i是A的对手，j是B的对手，k是C的对手
		for (i = 'x'; i <= 'z'; i++) {
			for (j = 'x'; j <= 'z'; j++) {
				if (i != j) {
					for (k = 'x'; k <= 'z'; k++) {
						if (i != k && j != k) {
							if (i != 'x' && k != 'x' && k != 'z') {
								System.out.println("A-" + i);
								System.out.println("B-" + j);
								System.out.println("C-" + k);
							}
						}
					}
				}
			}
		}

	}

}
