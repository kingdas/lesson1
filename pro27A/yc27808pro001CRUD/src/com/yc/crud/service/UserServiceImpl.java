package com.yc.crud.service;

import java.util.List;

import com.yc.crud.dao.UserDao;
import com.yc.crud.dao.UserDaoImpl;
import com.yc.crud.model.UserModel;
import com.yc.crud.model.UserQueryModel;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	@Override
	public int add(UserModel u) {
		return userDao.add(u);
	}

	@Override
	public int del(int operator_id) {
		return userDao.del(operator_id);
	}

	@Override
	public int update(UserModel u) {
		return userDao.update(u);
	}

	@Override
	public UserModel findById(int operator_id) {
		return userDao.findById(operator_id);
	}

	@Override
	public List<UserModel> findAll() {
		return userDao.findAll();
	}

	@Override
	public boolean nameExists(String name) {
		UserQueryModel uq = new UserQueryModel();
		uq.setName(name);
		List<UserModel> us = userDao.findByCondition(uq);
		if (us != null && us.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<UserModel> findByNameOrStatus(UserQueryModel uq) {
		return userDao.findByCondition(uq);
	}

	public static void main(String[] args) {
		UserService us = new UserServiceImpl();
		System.out.println(us.nameExists("zs1"));
	}

}
