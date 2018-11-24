<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <jsp:forward page=""></jsp:forward>
<jsp:include page=""></jsp:include>
<jsp:useBean id=""></jsp:useBean>
<jsp:setProperty property="" name=""/>
<jsp:getProperty property="" name=""/> --%>
	<%-- <jsp:include page="y.jsp"></jsp:include>
	<%!int a = 99;%> --%>
	<jsp:useBean id="u" class="com.yc.User"></jsp:useBean>
	<jsp:setProperty property="name" name="u" value="zs" />
	<jsp:getProperty property="name" name="u" />
	<br /> ${u },,${u.name }
</body>
</html>