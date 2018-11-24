package com.yc.userSys;

import java.util.List;

public interface BaseDao<T> {
	int add(T t);

	int del(int id);

	int update(T t);

	T findById(int id);

	List<T> findAll();

}
