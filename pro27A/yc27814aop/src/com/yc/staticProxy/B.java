package com.yc.staticProxy;

//��̬����
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
