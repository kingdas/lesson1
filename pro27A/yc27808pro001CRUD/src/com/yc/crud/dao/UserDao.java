package com.yc.crud.dao;

import java.util.List;

import com.yc.crud.model.UserModel;
import com.yc.crud.model.UserQueryModel;

public interface UserDao {

	int add(UserModel u);

	int del(int operator_id);

	int update(UserModel u);

	UserModel findById(int operator_id);

	List<UserModel> findByCondition(UserQueryModel uq);

	List<UserModel> findAll();

}
