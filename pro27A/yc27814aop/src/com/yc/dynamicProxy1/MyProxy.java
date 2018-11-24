package com.yc.dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyProxy {

	public static Object getProxy(final Object ro, InvocationHandler ih) {
		Object po = null;
		po = Proxy.newProxyInstance(Thread.currentThread()
				.getContextClassLoader(), ro.getClass().getInterfaces(), ih);
		return po;
	}

}
