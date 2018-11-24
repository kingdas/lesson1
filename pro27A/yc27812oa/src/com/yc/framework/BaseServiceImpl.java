package com.yc.framework;

import java.util.List;


public abstract class BaseServiceImpl<T> implements BaseService<T> {

	public abstract BaseDao<T> getDao();

	@Override
	public int add(T t) {
		return getDao().add(t);
	}

	@Override
	public int del(int id) {
		return getDao().del(id);
	}

	@Override
	public int update(T t) {
		return getDao().update(t);
	}

	@Override
	public T findById(int id) {
		return getDao().findById(id);
	}

	@Override
	public List<T> findAll() {
		return getDao().findAll();
	}

	@Override
	public List<T> findByCondition(T t) {
		return getDao().findByCondition(t);
	}

}
