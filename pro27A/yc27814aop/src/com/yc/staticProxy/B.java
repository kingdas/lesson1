package com.yc.staticProxy;

//¾²Ì¬´úÀí
public class B implements Ai {
	A a = new A();

	public void a() {
		//
		System.out.println("...");
		x();
		a.a();
		System.out.println("***");
	}
	
	void x()
	{
		
	}

}
