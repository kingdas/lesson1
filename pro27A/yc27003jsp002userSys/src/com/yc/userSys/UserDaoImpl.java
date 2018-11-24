package com.yc.userSys;

import java.util.List;

import com.yc.framework.DbUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public int add(UserModel u) {
		String sql = "";
		if (u != null && u.getId() != null) {
			sql = "insert into t_user(id,name,tel,group_id)values(" + u.getId()
					+ ",'" + u.getName() + "','" + u.getTel() + "',"
					+ u.getGroup_id() + ")";
		} else {
			sql = "insert into t_user(name,tel,group_id)values('" + u.getName()
					+ "','" + u.getTel() + "'," + u.getGroup_id() + ")";
		}
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int del(int id) {
		String sql = "delete from t_user where id=" + id + "";
		return DbUtils.executeCUD(sql);
	}

	@Override
	public int update(UserModel u) {
		String sql = "update t_user set name='" + u.getName() + "',tel='"
				+ u.getTel() + "',group_id=" + u.getGroup_id() + " where id="
				+ u.getId();
		return DbUtils.executeCUD(sql);
	}

	@Override
	public UserModel findById(int id) {
		String sql = "select * from t_user where id=" + id;
		List<UserModel> us = DbUtils.executeR(sql, UserModel.class);
		if (us != null && us.size() > 0) {
			return us.get(0);
		}
		return null;
	}

	@Override
	public List<UserModel> findAll() {
		String sql = "select * from t_user";
		return DbUtils.executeR(sql, UserModel.class);
	}

}
