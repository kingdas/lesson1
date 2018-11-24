package com.yc.dynamicProxy1;

public class Test {

	public static void main(String[] args) {

		final UserDaoImpl udi = new UserDaoImpl();
		UserDao ud = (UserDao) MyProxy.getProxy(udi, new MyInvocationHandler() {

			@Override
			public Object getRo() {
				return udi;
			}

			@Override
			public void b() {
				System.out.println("haha");

			}

			@Override
			public void a() {
				System.out.println("...***");

			}
		});
		ud.add();

	}

}
