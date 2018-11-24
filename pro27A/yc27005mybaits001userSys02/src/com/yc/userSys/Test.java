package com.yc.userSys;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) {

		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Thread
				.currentThread().getContextClassLoader()
				.getResourceAsStream("mybatis.xml"));
		SqlSession s = sf.openSession();
		// try {
		// s.insert("com.yc.userSys.UserDao" + ".add", new UserModel("q3",
		// "111", 1));
		// s.commit();// 提交事务
		// } catch (Exception e) {
		// e.printStackTrace();
		// s.rollback();// 回滚事务
		// } finally {
		// s.close();
		// }
		// System.out.println("ok");
		// // /////////////////////
		// try {
		// s.delete("com.yc.userSys.UserDao" + ".del", 5);
		// s.commit();// 提交事务
		// } catch (Exception e) {
		// e.printStackTrace();
		// s.rollback();// 回滚事务
		// } finally {
		// s.close();
		// }
		// System.out.println("ok");
		// // /////////////////////
		// UserModel u = s.selectOne("com.yc.userSys.UserDao" + ".findById",
		// 12);
		// System.out.println(u);
		// u.setName("zs");
		// try {
		// s.update("com.yc.userSys.UserDao" + ".update", u);
		// s.commit();// 提交事务
		// } catch (Exception e) {
		// e.printStackTrace();
		// s.rollback();// 回滚事务
		// } finally {
		// s.close();
		// }
		// System.out.println("ok");
		// /////////////////////
		List<UserModel> us = s
				.selectList("com.yc.userSys.UserDao" + ".findAll");
		System.out.println(us);

	}

}
