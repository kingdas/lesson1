<%@page import="java.util.List"%>
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
		request.setCharacterEncoding("utf-8");
		String m = request.getParameter("m");
		UserDao userDao = new UserDaoImpl();
		if ("add".equals(m)) {
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String groupId = request.getParameter("group_id");
			int group_id = Integer.parseInt(groupId);
			UserModel u = new UserModel(name, tel, group_id);
			userDao.add(u);
			response.sendRedirect("controller.jsp");//重定向
		} else if ("del".equals(m)) {
			String ids = request.getParameter("id");
			int id = Integer.parseInt(ids);
			userDao.del(id);
			response.sendRedirect("controller.jsp");
		} else if ("update".equals(m)) {
			String ids = request.getParameter("id");
			int id = Integer.parseInt(ids);
			UserModel u = userDao.findById(id);
			request.setAttribute("u", u);
			request.getRequestDispatcher("userUpdate.jsp").forward(request,
					response);
		} else if ("doUpdate".equals(m)) {
			String ids = request.getParameter("id");
			int id = Integer.parseInt(ids);
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String groupId = request.getParameter("group_id");
			int group_id = Integer.parseInt(groupId);
			UserModel u = new UserModel(id, name, tel, group_id);
			userDao.update(u);
			response.sendRedirect("controller.jsp");//重定向 
		} else {
			List<UserModel> us = userDao.findAll();
			request.setAttribute("us", us);
			request.getRequestDispatcher("userList.jsp").forward(request,
					response);
		}
	%>
	<%!int x;

	void t(HttpServletRequest request ) {
		String name = request.getParameter("name");
	}%>
</body>
</html>