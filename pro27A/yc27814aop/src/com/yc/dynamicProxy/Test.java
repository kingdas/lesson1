package com.yc.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {

		final UserDaoImpl udi = new UserDaoImpl();
		UserDao ud = (UserDao) Proxy.newProxyInstance(Thread.currentThread()
				.getContextClassLoader(), udi.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						System.out.println("...");
						Object o = method.invoke(udi, args);
						System.out.println("***");
						return o;
					}
				});
		ud.add();
		//ud.del();

	}

}
