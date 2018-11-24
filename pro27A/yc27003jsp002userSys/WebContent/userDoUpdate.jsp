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
		request.setCharacterEncoding("utf-8");//设置编号-解决乱码
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String groupId = request.getParameter("group_id");
		int group_id = Integer.parseInt(groupId);
		UserModel u = new UserModel(id, name, tel, group_id);
		UserDao userDao = new UserDaoImpl();
		//out.print(u);
		userDao.update(u);
		response.sendRedirect("userList.jsp");//重定向 
	%>
</body>
</html>