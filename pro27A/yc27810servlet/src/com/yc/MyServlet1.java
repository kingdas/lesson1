package com.yc;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/ms1")
public class MyServlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {

		System.out.println("...");

		HttpServletRequest req = (HttpServletRequest) arg0;
		Cookie[] cs = req.getCookies();
		for (Cookie ct : cs) {
			if ("u".equals(ct.getName())) {
				arg1.getWriter().print(ct.getValue());
			}
		}

	}

}
