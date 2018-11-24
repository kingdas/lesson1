package com.yc.java015interface;

//接口中的方法必须是抽象方法
//接口不能实例化
//接口中抽象方法默认修饰符是public abstract
//接口中可以有属性；属性的修饰符默认是public static final

////接口可以继承接;且能多继承接口
//类只能单继承类，但多实现接口
//父类引用指向子类对象时，不能调用子类扩展

public interface Animal {

	int ANIAML_AGE = 9;// final:修饰变量称其为常量---不可变；需要经初值

	// ctrl+shift+x|y
	// 规范

	void eat();// public abstract

	void sleep();

}
