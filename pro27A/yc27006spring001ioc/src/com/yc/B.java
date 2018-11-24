package com.yc;

public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		System.out.println("***");
		this.a = a;
	}

	public B() {
	}

	public B(A a) {
		super();
		System.out.println("###");
		this.a = a;
	}

	void b() {
		System.out.println("b....");
	}

	public static void main(String[] args) {
		// B b = new B();
		// // b.b();
		// b.getA().a();
		// // ///////////////////
		// B b = new B(new A());
		// b.getA().a();
		// ///////////////////
		// B b = new B();
		// b.setA(new A());
		// b.getA().a();

	}

}
