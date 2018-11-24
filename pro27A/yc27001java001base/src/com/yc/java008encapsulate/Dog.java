package com.yc.java008encapsulate;

public class Dog {// {}封装；类体：就是封装；封装属性和方法；封装就是定义类
	private/* 私有的 */int age;// 属性
	// 访问修饰符：私有的---只能在类的内部使用
	public String name;
	// 公共的---在任何地方都可以使用
	int a;

	// 默认的---在同包中可以使用
	void eat() {// 方法
		age = 3;
		// int x;
		// System.out.println(x);
		System.out.println(name);
	}

	int b = age;

	void sleep() {// 所有方法都是平级关系，不能嵌套定义
		// void t()
		// {
		//
		// }

		new A().a = 22;
	}

	class A// 内部类
	{
		private int a;
	}
}// 外部类
