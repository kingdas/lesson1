package com.yc.java014abstractClass;

//abstract修饰 的类是抽象类；
//抽象类不能实例化
//一个java源文件中可以有多个类，但只能有一个公共类，且这个公共类要和文件同名
//没有方法体的方法是“抽象方法”
//含有抽象方法的类必然是抽象类
// 抽象类不一定含有抽象方法
//一个类继承于一个抽象类，这个类要么变成抽象的，要么“实现抽象父类的抽象方法”

public abstract class Animal {

	abstract void eat();// 没有方法体的方法是“抽象方法”
	// 含有抽象方法的类必然是抽象类
	// 抽象类不一定含有抽象方法

	void sleep() {

	}

	public static void main(String[] args) {
		Animal an = new Dog();
		an.eat();
	}

}

interface A {

}

// 一个类继承于一个抽象类，这个类要么变成抽象的，要么“实现抽象父类的抽象方法”
// abstract
class Dog extends Animal {

	@Override
	void eat() {
		System.out.println("dog.eat");
	}

}
