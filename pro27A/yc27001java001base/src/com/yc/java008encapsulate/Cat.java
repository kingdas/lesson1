package com.yc.java008encapsulate;

public class Cat {

	// 构造方法：作用是构造对象的；构造对象时调用的方法
	// 若我们不提供任何的构造方法，那系统将为我们增加一个无参的构造方法，
	// 若我们提供任何的构造方法，那么系统将不在为我们增加那个无参构造方法
	// public Cat() {// 特殊的方法；无返回值类型，与类同名，
	//
	// }

	// int a;
	// a=5;

	// int a=5;

	int a;

	{// 代码段
		a = 5;
		System.out.println("**");
	}
	static {// 静态代码段
		System.out.println("%%%");
	}

	public Cat() {
		// Cat(5);//一个构造方法中去调用另一个构造方法，不能用构造方法的名字调用；得用this();
		this(5);
		// a = 6;
		System.out.println("..");
	}

	public Cat(int age) {
		System.out.println("...");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
	}

}
