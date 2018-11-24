<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/loan/list" target="cnt">查看申请列表</a>
	<br />
	<a href="${pageContext.request.contextPath }/page/add" target="cnt">发起申请借款</a>
	<br />
	<c:if test="${emp.groupId==1 }">
		<a href="">审批申请</a>
		<br />
	</c:if>
	<a href="${pageContext.request.contextPath }/login.jsp" target="_top">重新登录</a>
	<br />
</body>
</html>