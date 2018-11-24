package com.yc.java012Inheritence1;

import java.lang.reflect.Field;

public class B extends A {
	int c;

	public static void main(String[] args) {
		Class cls = B.class;
		Field[] fs = cls.getDeclaredFields();
		for (Field f : fs) {
			f.setAccessible(true);
			System.out.println(f.getName());
		}

		B b = new B();
		b.setA(3);
		b.getA();
	}

}
