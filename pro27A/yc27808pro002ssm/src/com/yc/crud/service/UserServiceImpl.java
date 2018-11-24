package com.yc.crud.service;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.yc.crud.dao.UserDao;
import com.yc.crud.model.UserModel;
import com.yc.crud.model.UserQueryModel;

@Service
public class UserServiceImpl implements UserService {

	// @Resource
	@Autowired
	private UserDao userDao;// = new UserDaoImpl();

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
//		UserService us = new UserServiceImpl();
//		System.out.println(us.nameExists("zs1"));
		//////////////////////
		BeanFactory bf=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserService us=(UserService)bf.getBean("userServiceImpl");
		System.out.println(us.nameExists("zs"));
	}

}
