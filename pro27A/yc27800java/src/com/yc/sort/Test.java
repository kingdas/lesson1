package com.yc.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] a = new int[10];
		// com.yc.Test.init(a);
		// com.yc.Test.print(a);
		// // com.yc.Test.sort(a);
		// Arrays.sort(a);
		// com.yc.Test.print(a);
		// ///////////////////////////
		// String a = "ebc", b = "ccd";
		// System.out.println(a.compareTo(b));
		// // //////////////////////
		// User[] us = { new User(22, "zs"), new User(23, "ls") };
		// for (User u : us) {
		// System.out.println(u);
		// }
		// Arrays.sort(us);
		// for (User u : us) {
		// System.out.println(u);
		// }

		// //////////////////////
		User[] us = { new User(22, "zs"), new User(23, "ls") };
		for (User u : us) {
			System.out.println(u);
		}
		Arrays.sort(us, new Comparator<User>() {// 匿名的内部类
					@Override
					public int compare(User o1, User o2) {
						// return o1.getName().compareTo(o2.getName());
						return o1.getAge() - o2.getAge();
					}
				});
		for (User u : us) {
			System.out.println(u);
		}

	}

}
