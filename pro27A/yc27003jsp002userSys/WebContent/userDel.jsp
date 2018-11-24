<%@page import="com.yc.userSys.UserDaoImpl"%>
<%@page import="com.yc.userSys.UserDao"%>
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
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		UserDao userDao = new UserDaoImpl();
		userDao.del(id);
		response.sendRedirect("userList.jsp");
	%>
</body>
</html>