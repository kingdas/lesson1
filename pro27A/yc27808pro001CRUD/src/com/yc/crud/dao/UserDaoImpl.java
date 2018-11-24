package com.yc.crud.dao;

import java.util.List;

import com.yc.crud.model.UserModel;
import com.yc.crud.model.UserQueryModel;
import com.yc.framework.DbUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public int add(UserModel u) {
		String sql;
		if (u.getOperator_id() != null) {
			sql = "insert into t_user(operator_id,name,password,status)values("
					+ u.getOperator_id() + ",'" + u.getName() + "','"
					+ u.getPassword() + "'," + u.getStatus() + ")";
		} else {
			sql = "insert into t_user(name,password,status)values('"
					+ u.getName() + "','" + u.getPassword() + "',"
					+ u.getStatus() + ")";
		}
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int del(int operator_id) {
		String sql = "delete from t_user where operator_id=" + operator_id;
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int update(UserModel u) {
		String sql = "update t_user set name='" + u.getName() + "',password='"
				+ u.getPassword() + "',status=" + u.getStatus()
				+ " where operator_id=" + u.getOperator_id() + "";
		return DbUtils.executeCUD(sql);
	}

	@Override
	public UserModel findById(int operator_id) {
		String sql = "select * from t_user where operator_id=" + operator_id;
		List<UserModel> us = DbUtils.executeR(sql, UserModel.class);
		if (us != null && us.size() == 1) {
			return us.get(0);
		}
		return null;
	}

	@Override
	public List<UserModel> findByCondition(UserQueryModel uq) {
		String sql = "select * from t_user where 1=1";
		if (uq != null) {// 有条件
			if (uq.getStatus() == null) {// 用户姓名精确查询
				if (uq.getName() != null && uq.getName().trim().length() > 0) {
					sql += " and name='" + uq.getName() + "'";
				}
			} else {// 根据姓名模糊查询、状态联合查询
				if (uq.getName() != null && uq.getName().trim().length() > 0) {
					sql += " and name like '%" + uq.getName() + "%'";
				}
				if (uq.getStatus() != -1) {
					sql += " and status=" + uq.getStatus();
				}
			}
		}
		return DbUtils.executeR(sql, UserModel.class);
	}

	@Override
	public List<UserModel> findAll() {
		// String sql = "select * from t_user";
		// List<UserModel> us = DbUtils.executeR(sql, UserModel.class);
		// return us;
		return findByCondition(null);
	}

}
