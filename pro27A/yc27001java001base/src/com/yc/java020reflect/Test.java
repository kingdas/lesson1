package com.yc.java020reflect;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) {

		// new A();
		// t("com.yc.java020reflect.A");
		// ////////////////////////////
		// System.out.println(new A());
		// //////////////////////////////
		
		
		
		
		
		
		
		
		try {
			Class cls = Class.forName("com.yc.java020reflect.A");
			Object o = cls.newInstance();
			Object o1 = cls.newInstance();
			Field[] fs = cls.getDeclaredFields();
			Field f = cls.getDeclaredField("id");
			f.setAccessible(true);
			f.set(o, 5);
			System.out.println(o);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void t(String className) {
		// new className();
		// new com.yc.java020reflect.A();
		// //////////////////
		try {
			Class cls = Class.forName(className);
			Object o = cls.newInstance();
			if (o instanceof A) {
				A a = (A) o;
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
