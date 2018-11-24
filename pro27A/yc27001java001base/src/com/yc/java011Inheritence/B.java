package com.yc.java011Inheritence;

//继承：代码重用
//实例化子类对象时，会自动先实例化父类的对象
//在java中，类只能单继承，“但可多实现”
public class B/* 子类，派生类 */extends A/* 父类，基类，超类 */{

	void bt() {
		// b=9;
		a = 3;
		t();
		toString();
	}

	public B() {
		super(4);
		// 隐式调用
		// super();//显式---调用父类的构造方法
		System.out.println(2);
	}

	public B(String s) {
		System.out.println(8);
	}

	public static void main(String[] args) {
		new B();
	}

}
