package com.yc.java011Inheritence;

public class F extends E {
	// 重写，@注解
	@Override
	void e() {// 方法的重写：前提是方法的“签名”完全相同，访问修饰符只能扩大不能缩小

	}

	// 扩展的方法
	void f() {

	}

	public static void main(String[] args) {
		E e = new F();// 子类的对象是可以保存在父类的变量中。
		// 向上转型
		
		
	}

}
