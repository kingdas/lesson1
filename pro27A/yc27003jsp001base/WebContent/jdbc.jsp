<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		Class.forName("com.mysql.jdbc.Driver");// 反射
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/db_gw", "root", "root");
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from t_user");
		while (rs.next()) {
	%>
	<%
		out.print(rs.getInt("id") + "," + rs.getString("name") + ","
					+ rs.getInt("group_id") + "<br/>");
	%>
	<%
		}
		rs.close();
		stat.close();
		conn.close();
	%>
 --%>
	<table width="640" border="1" align="center">
		<%
			Class.forName("com.mysql.jdbc.Driver");// 反射
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_gw", "root", "root");
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from t_user");
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("tel")%></td>
			<td><%=rs.getInt("group_id")%></td>
		</tr>
		<%
			}
			rs.close();
			stat.close();
			conn.close();
		%>
	</table>
</body>
</html>