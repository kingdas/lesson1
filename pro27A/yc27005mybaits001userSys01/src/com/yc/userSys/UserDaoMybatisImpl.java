package com.yc.userSys;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserDaoMybatisImpl implements UserDao {
	SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Thread
			.currentThread().getContextClassLoader()
			.getResourceAsStream("mybatis.xml"));

	@Override
	public int add(UserModel u) {
		int n = 0;
		SqlSession s = sf.openSession();
		try {
			n = s.insert("com.yc.userSys.UserDao" + ".add", u);
			s.commit();// 提交事务
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();// 回滚事务
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public int del(int id) {
		int n = 0;
		SqlSession s = sf.openSession();
		try {
			n = s.delete("com.yc.userSys.UserDao" + ".del", id);
			s.commit();// 提交事务
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();// 回滚事务
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public int update(UserModel u) {
		int n = 0;
		SqlSession s = sf.openSession();
		try {
			n = s.update("com.yc.userSys.UserDao" + ".update", u);
			s.commit();// 提交事务
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();// 回滚事务
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public UserModel findById(int id) {
		UserModel u = null;
		SqlSession s = sf.openSession();
		try {
			u = s.selectOne("com.yc.userSys.UserDao" + ".findById", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return u;
	}

	@Override
	public List<UserModel> findAll() {
		List<UserModel> us = null;
		SqlSession s = sf.openSession();
		try {
			us = s.selectList("com.yc.userSys.UserDao" + ".findAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return us;
	}

}
