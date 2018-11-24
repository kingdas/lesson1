package com.yc.staticProxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// A a = new A();
		// a.a();
		// // ////////////
		// B b = new B();
		// b.a();
		// ////////////
		// ////////////
		Ai a = new B();
		a.a();

	}

}
