package com.yc.java021dao;

import java.util.List;

public interface UserDao {
	int add(UserModel u);

	int del(int id);

	int update(UserModel u);

	UserModel findById(int id);

	List<UserModel> findAll();

}
