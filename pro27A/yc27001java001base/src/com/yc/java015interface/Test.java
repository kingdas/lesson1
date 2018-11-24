package com.yc.java015interface;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// int t= Animal.ANIAML_AGE;
////////////////////////////////////
//		Class cls = Animal.class;
//		try {
//			Field f = cls.getDeclaredField("ANIAML_AGE");
//			System.out.println(Modifier.toString(f.getModifiers()));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		////////////////////////////////
//		Animal an=new Dog();
//		an.eat();
////////////////////////////////
		A a=new T();
		a.a();
//		a.b();
	}

}
