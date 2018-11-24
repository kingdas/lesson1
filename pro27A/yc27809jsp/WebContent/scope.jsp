<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope范围: page&lt;request&lt;session&lt;application</h1>
	<%-- 	<%
		request.setAttribute("r", "rv");
		pageContext.setAttribute("rpc", "rpcv", pageContext.REQUEST_SCOPE);
	%>

	<br /> r=<%=request.getAttribute("r")%>,${r}
	<br />rpc=<%=request.getAttribute("rpc")%>,<%=pageContext
					.getAttribute("rpc", pageContext.REQUEST_SCOPE)%>,${rpc } --%>
	<%-- <%
		pageContext.setAttribute("p", "pv");
		pageContext.setAttribute("px", "pxv", pageContext.PAGE_SCOPE);
	%>
	<br>p=<%=pageContext.getAttribute("p")%>,${p },${pageScope.p }
	<br>px=<%=pageContext.getAttribute("px")%>,${px },<%=pageContext.getAttribute("px", pageContext.PAGE_SCOPE)%> --%>


	<%
		/* page.setAttribute("x", 1); */
		pageContext.setAttribute("x", 5);
		request.setAttribute("x", 55);
		session.setAttribute("x", 555);
		application.setAttribute("x", 5555);
		response.sendRedirect("scopeVal.jsp");
	%>
	<%-- 	<jsp:forward page="scopeVal.jsp"></jsp:forward> --%>
	<%-- ${x }, --%>
	,${pageScope.x },${requestScope.x },${sessionScope.x
	},${applicationScope.x }

</body>
</html>