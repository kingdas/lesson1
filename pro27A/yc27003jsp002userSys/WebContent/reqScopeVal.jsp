<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 标签库指令 -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	[${n }]
	<br /> ${x }
	<br /> ${requestScope.u }
	<br /> ${us }
	<br />id=${param.id}
	<hr />
	<h3>JSTL</h3>
	<c:forEach begin="1" end="9" step="1" var="i">
		<c:set var="c" value="color='#000000'" />
		<c:if test="${i%2==0 }">
			<c:set var="c" value="color='#${i}0${i}0${i}0'" />
		</c:if>
		<hr size="${i}" ${c}/>
	</c:forEach>
	<hr />
	<c:if test="${us!=null }">
		<c:forEach items="${us }" var="u">
	 ${u.id},${u.name},${u.tel},${u.group_id}<br />
		</c:forEach>
	</c:if>
</body>
</html>