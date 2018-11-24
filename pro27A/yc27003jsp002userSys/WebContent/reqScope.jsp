<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		request.setAttribute("x", 5);//设置属性x,值为5
		request.setAttribute("u", new UserModel(1, "x", "12", 1));
		List<UserModel> us = new ArrayList<UserModel>();
		us.add(new UserModel(1, "x", "12", 1));
		us.add(new UserModel(2, "xx", "1212", 2));
		us.add(new UserModel(3, "xxx", "121212", 1));
		request.setAttribute("us", us);
		//response.sendRedirect("reqScopeVal.jsp");//重定向
		request.getRequestDispatcher("reqScopeVal.jsp").forward(request,
				response); //转发
	%>
	<%-- <%=request.getAttribute("n") + "<br/>"%>
	<%=request.getAttribute("x") + "<br/>"%>
	<%=request.getAttribute("u") + "<br/>"%>
	<%=request.getAttribute("us") + "<br/>"%>
	<hr />
	[${n }]
	<br /> ${x }
	<br /> ${requestScope.u }
	<br /> ${us }
	<br />id=${param.id} --%>

</body>
</html>