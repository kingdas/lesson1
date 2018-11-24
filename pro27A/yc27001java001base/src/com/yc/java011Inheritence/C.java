package com.yc.java011Inheritence;

public class C {

	{
		System.out.print(1);
	}
	static {
		System.out.print(2);
	}

	public C() {
		System.out.print(3);
	}

	public C(int n) {
		this();
		System.out.print(4);
	}

}
