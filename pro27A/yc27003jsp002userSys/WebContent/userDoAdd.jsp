<%@page import="com.yc.userSys.UserDaoImpl"%>
<%@page import="com.yc.userSys.UserDao"%>
<%@page import="com.yc.userSys.UserModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String groupId = request.getParameter("group_id");
		int group_id = Integer.parseInt(groupId);
		UserModel u = new UserModel(name, tel, group_id);
		UserDao userDao = new UserDaoImpl();
		userDao.add(u);
		response.sendRedirect("userList.jsp");//重定向
	%>
</body>
</html>