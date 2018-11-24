package com.yc.java008encapsulate;

public class StaticTest {
	// static
	// 类属性和类方法(静态成员)---对象属性和方法（非静态成员）
	int a;
	static int b;// 类属性

	// 静态属性是所有对象共享的，一个对象修改了静态属性的值，其它对象该值会受此影响
	// 建议：静态成员的访问用类名直接访问

	void t() {
		a = 5;
		b = 8;
	}

	static void tt() {// 类方法
		// a = 55;// 在静态成员中不能使用非静态成员
		// 为什么？静态成员的创建先于非静态成员
		b = 88;
	}

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		st1.a = 11;
		st1.b = 111;
		StaticTest.b=1111;
		System.out.println("st1.a=" + st1.a + ",st1.b=" + st1.b);
		StaticTest st2 = new StaticTest();
		st2.a = 22;
		st2.b = 222;
		System.out.println("st2.a=" + st2.a + ",st2.b=" + st2.b);
		System.out.println("st1.a=" + st1.a + ",st1.b=" + st1.b);

	}

}
