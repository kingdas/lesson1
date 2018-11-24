package com.yc.java011Inheritence;

public class D extends C {

	{
		System.out.print(5);
	}
	static {
		System.out.print(6);
	}

	public D() {
		this(2);
		System.out.print(7);
	}

	public D(int n) {
		super(4);
		System.out.print(8);
	}

	public static void main(String[] args) {
		new D();
	}

}
