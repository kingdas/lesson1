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
			sql = "insert into t_user(name,tel,group_id)values('" + u.getName() + "','" + u.getTel() + "',"
					+ u.getGroup_id() + ")";
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
