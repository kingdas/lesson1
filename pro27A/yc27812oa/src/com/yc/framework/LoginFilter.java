package com.yc.framework;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.oa.model.Employee;

public class LoginFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		if(req.getSession().getAttribute("emp")!=null||req.getRequestURL().toString().endsWith("login.jsp")||req.getRequestURL().toString().endsWith("login"))
			{
			chain.doFilter(request, response);
			}else
			{
				((HttpServletResponse)response).sendRedirect("/yc27812oa/login.jsp");
			}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
