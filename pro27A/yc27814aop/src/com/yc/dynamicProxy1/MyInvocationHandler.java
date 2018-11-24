package com.yc.dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class MyInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		a();
		Object o = method.invoke(getRo(), args);
		b();
		return null;
	}

	public abstract void a();

	public   void b(){};

	public abstract Object getRo();

}
