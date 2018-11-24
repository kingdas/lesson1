package com.yc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Lgn extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		// try {
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn = DriverManager.getConnection(
		// "jdbc:mysql://localhost:3306/oa", "root", "root");
		// Statement stat = conn.createStatement();
		// String sql = "select * from employee where loginName='" + name
		// + "' and password='" + password + "'";
		// System.out.println(sql);
		// ResultSet rs = stat.executeQuery(sql);
		// if (rs.next()) {
		// System.out.println("µÇÂ¼³É¹¦");
		// } else {
		// System.out.println("µÇÂ¼Ê§°Ü");
		// }
		// rs.close();
		// stat.close();
		// conn.close();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// /////////////////////////////////////////
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/oa", "root", "root");
			String sql = "select * from employee where loginName=? and password=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, name);
			pstat.setString(2, password);
			ResultSet rs = pstat.executeQuery();
			if (rs.next()) {
				System.out.println("µÇÂ¼³É¹¦");
			} else {
				System.out.println("µÇÂ¼Ê§°Ü");
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("µÇÂ¼Ê§°Ü..");
		}

	}

}
