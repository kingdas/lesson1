package com.yc.userSys;

import java.util.List;

import com.yc.framework.DbUtils;

public class Test {

	public static void main(String[] args) {
		// DbUtils.getConnection();
		// /////////////////////////////////////
		// int n;
		// UserDao userDao = new UserDaoImpl();
		// // System.out.println(userDao.del(9));
		// UserModel u = new UserModel("aaa", "111", 1);
		// n = userDao.add(u);
		// System.out.println(n);
		// u = new UserModel(20, "aaa", "111", 1);
		// n = userDao.add(u);
		// System.out.println(n);
		// /////////////////////////////////////
		List<UserModel> us = DbUtils.executeR("select * from t_user",
				UserModel.class);
		System.out.println(us);
	}
}
