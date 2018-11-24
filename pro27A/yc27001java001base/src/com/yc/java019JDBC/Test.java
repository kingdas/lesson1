package com.yc.java019JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

import com.mysql.jdbc.log.Log;

public class Test {

	public static void main(String[] args) throws Exception {
		// // JDBC:
		// // 0.导入包
		// // 第三方JAR包
		// // 1.注册驱动
		// Class.forName("com.mysql.jdbc.Driver");// 反射
		// // 2.获取"连接对象"
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://localhost:3306/db_gw", "root", "root");
		// // 3.获取命令对象
		// Statement stat = conn.createStatement();
		// // 4.执行SQL语句
		// ResultSet rs = stat.executeQuery("select * from t_user");
		// // 5.处理结果
		// while (rs.next()) {
		// System.out.println(rs.getInt("id") + "," + rs.getString("name")
		// + "," + rs.getInt("group_id"));
		// }
		// // 6.释放资源
		// rs.close();
		// stat.close();
		// conn.close();
		//
		// // stat.executeUpdate("delete from t_user where id=5");
		// // // ////////////////////////////////
		// ResultSet rs = DbUtils.executeR("select * from t_user");
		// while (rs.next()) {
		// System.out.println(rs.getInt("id") + "," + rs.getString("name")
		// + "," + rs.getInt("group_id"));
		// }
		// rs.close();
		// // // ////////////////////////////////
		// int n = DbUtils
		// .executeCUD("insert into t_user(name,tel,group_id)values( 'xx' ,'111',1)");
		// System.out.println(n);
		// // // ////////////////////////////////
		// int n = DbUtils.executeCUD("update t_user set name='yy' where id=8");
		// System.out.println(n);
		// // ////////////////////////////////
		// int n = DbUtils.executeCUD("delete from t_user where id=8");
		// System.out.println(n);
		// // // ////////////////////////////////
		// Connection conn = DbUtils.getConnection();
		// ResultSet rs = DbUtils.executeR(conn, "select * from t_user");
		// while (rs.next()) {
		// System.out.println(rs.getInt("id") + "," + rs.getString("name")
		// + "," + rs.getInt("group_id"));
		// }
		// DbUtils.release(conn, null, rs);
		// // ////////////////////////////////
		// Properties p = new Properties();
		// p.load(Thread.currentThread().getContextClassLoader()
		// .getResourceAsStream("dbInof.properties"));
		// String url = (String) p.get("url");
		// System.out.println(url);
		// // ////////////////////////////////
		// List<User> us = new ArrayList<User>();
		// User u = null;
		// Connection conn = DbUtils.getConnection();
		// ResultSet rs = DbUtils.executeR(conn, "select * from t_user");
		// while (rs.next()) {
		// u = new User(rs.getInt("id"), rs.getString("name"),
		// rs.getString("tel"), rs.getInt("group_id"));
		// us.add(u);
		// }
		// DbUtils.release(conn, null, rs);
		// System.out.println(us);
		// //////////////////////////////////
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://localhost:3306/db_gw", "root", "root");
		// Statement stat = conn.createStatement();
		// int n = stat
		// .executeUpdate("create table t_x(id int primary key auto_increment,name varchar(50))");
		// stat.close();
		// conn.close();
		// System.out.println("ok");
		// // // ////////////////////////////////
		// //////////////////////////////////
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://localhost:3306/db_gw", "root", "root");
		// Statement stat = conn.createStatement();
		// long t = new Date().getTime();// 1970-1-1 0:0:0.000--时间0；
		// for (int i = 0; i < 1000; i++) {
		// stat.executeUpdate("insert into t_x(name)values('x" + i + "')");
		// }
		// stat.close();
		// conn.close();
		// System.out.println(t - new Date().getTime()-t);//24430
		// // // // ////////////////////////////////
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://localhost:3306/db_gw", "root", "root");
		// PreparedStatement pstat =
		// conn.prepareStatement("insert into t_x(name)values(?)");//？占位符
		// long t = new Date().getTime();// 1970-1-1 0:0:0.000--时间0；
		// for (int i = 0; i < 1000; i++) {
		// pstat.setString(1, "x"+i);//为占位符位置给值
		// pstat.execute();
		// }
		// pstat.close();
		// conn.close();
		// System.out.println(new Date().getTime()-t);//32620
		// // // ////////////////////////////////
		// // // ////////////////////////////////
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/db_gw", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement pstat = conn
				.prepareStatement("insert into t_x(name)values(?)");// ？占位符
		long t = new Date().getTime();// 1970-1-1 0:0:0.000--时间0；
		for (int i = 0; i < 1000; i++) {
			pstat.setString(1, "x" + i);// 为占位符位置给值
			pstat.addBatch();//批处理
			if ((i + 1) % 100 == 0) {
				pstat.executeBatch();
			}
		}
		pstat.executeBatch();
		conn.commit();
		pstat.close();
		conn.close();
		System.out.println(new Date().getTime() - t);
		// // ////////////////////////////////

	}
}
