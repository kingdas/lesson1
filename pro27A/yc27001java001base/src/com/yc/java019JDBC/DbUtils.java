package com.yc.java019JDBC;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 操作数据库的帮助类
 * 
 * @author Administrator
 * 
 */
public class DbUtils {
	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;

	/**
	 * 利用配置文件初始化属性
	 */
	static {
		Properties p = new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("dbInof.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		DRIVER = p.getProperty("driver");
		URL = p.getProperty("url");
		USERNAME = p.getProperty("username");
		PASSWORD = p.getProperty("password");
	}

	/**
	 * 静态代码块，注册驱动
	 */

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("驱动注册失败");
			e.printStackTrace();
		}
	}

	/**
	 * 获取连接对象
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.out.println("获取连接对象失败");
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 对数据库执行查询
	 * 
	 * @param sql
	 * @return
	 */
	// public static ResultSet executeR(String sql) {
	// Connection conn = null;
	// Statement stat = null;
	// ResultSet rs = null;
	// try {
	// conn = getConnection();
	// stat = conn.createStatement();
	// rs = stat.executeQuery(sql);
	// } catch (Exception e) {
	// System.out.println("sql语句执行错误");
	// e.printStackTrace();
	// }
	// return rs;
	// }

	public static ResultSet executeR(Connection conn, String sql) {
		Statement stat = null;
		ResultSet rs = null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
		} catch (Exception e) {
			System.out.println("sql语句执行错误");
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * 对数据库执行增删改操作
	 * 
	 * @param sql
	 * @return
	 */
	public static int executeCUD(String sql) {
		int n = 0;
		Connection conn = null;
		Statement stat = null;
		try {
			conn = getConnection();
			stat = conn.createStatement();
			n = stat.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("sql语句执行错误");
			e.printStackTrace();
		} finally {
			release(conn, stat, null);
		}
		return n;
	}

	/**
	 * 释放资源
	 * 
	 * @param conn
	 * @param stat
	 * @param rs
	 */
	public static void release(Connection conn, Statement stat, ResultSet rs) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (stat != null && !stat.isClosed()) {
				stat.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static <T> List<T> executeR(String sql, Class<T> cls) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		conn = getConnection();
		try {
			stat = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			rs = stat.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<T> ls = resultSetToModel(rs, cls);
		DbUtils.release(conn, stat, rs);
		return ls;
	}

	/**
	 * ResultSet转成List
	 * 
	 * @param rs
	 * @param cls
	 * @return
	 */
	public static <T> List<T> resultSetToModel(ResultSet rs, Class<T> cls) {
		ResultSetMetaData rsmd = null;
		List<T> ls = new ArrayList<T>();
		Object o = null;
		String cname = null;
		Field f = null;
		Object co = null;
		try {
			rsmd = rs.getMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				o = cls.newInstance();
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					cname = rsmd.getColumnName(i);// 列名
					co = rs.getObject(cname);// 列值
					try {
						f = cls.getDeclaredField(cname);
						f.setAccessible(true);
						f.set(o, co);
					} catch (NoSuchFieldException e) {
						e.printStackTrace();
					}
				}
				ls.add((T) o);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return ls;
	}

	// public static void main(String[] args) {
	// System.out
	// .println(DbUtils.executeR("select * from t_user", User.class));
	// }

}
