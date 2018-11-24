package com.yc.dynamicProxy1;

public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("userDao.add()");

	}

	@Override
	public void del() {
		System.out.println("userDao.del()");

	}

}
