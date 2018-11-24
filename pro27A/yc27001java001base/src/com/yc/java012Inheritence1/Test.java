package com.yc.java012Inheritence1;

public class Test {

	public static void main(String[] args) {

		// Animal an = new Dog();// 向上转型
		// an.eat();
		// Dog d = null;
		// if (an instanceof Dog) {
		// d = (Dog) an;// 向下转型
		// d.eat();
		// System.out.println("-------------");
		// }
		// Cat c = null;
		// if (an instanceof Cat) {// instanceof 判断某一对象是否是某个类的实例
		// c = (Cat) an;// ClassCastException
		// c.eat();
		// }
		// ////////////////////////////////////////////
		// 多态
		// * 继承
		// * 方法的重写
		// * 父类的引用指向子类的对象

		Animal an = new Dog();// 向上转型
		an.eat();
		// an.sleep();// 父类引用指向子类对象时，不能调用子类扩展
		an.toString();//

		an = new Cat();
		an.eat();
		
		Dog d=new Dog();
		d.sleep();

	}
}
