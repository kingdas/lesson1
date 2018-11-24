package com.yc.java013test;

public  class Test {

	public static void main(String[] args) {
		// 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，
		// 这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，
		// 又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，
		// 问海滩上原来最少有多少个桃子？
		int c = 0;
		float f;
		for (int i = 1; true; i++) {
			f = i;
			for (int j = 0; j < 5; j++) {
				f = (f - 1) * 4 / 5;
				if ((int) f != f) {
					break;
				}
			}
			if ((int) f == f) {
				System.out.println(i);
				if (++c % 10 == 0) {
					break;
				}
			}
		}

	}

}
