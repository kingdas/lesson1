package com.yc.framework;

import java.util.List;

public interface BaseService<T> {
	int add(T t);

	int del(int id);

	int update(T t);

	T findById(int id);

	List<T> findAll();

	List<T> findByCondition(T t);

}
