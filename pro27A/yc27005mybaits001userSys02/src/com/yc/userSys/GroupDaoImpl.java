package com.yc.userSys;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GroupDaoImpl implements GroupDao {
	SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Thread
			.currentThread().getContextClassLoader()
			.getResourceAsStream("mybatis.xml"));

	@Override
	public int add(GroupModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GroupModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GroupModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroupModel> findAll() {
		List<GroupModel> gs = null;
		SqlSession s = sf.openSession();
		try {
			gs = s.selectList("com.yc.userSys.GroupDao" + ".findAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return gs;
	}

}
