package com.yc;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(value = "/ms", loadOnStartup = 1)
@WebServlet("/ms")
public class MyServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("ooo");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ¥¶¿Ì«Î«Û
		System.out.println(request.getParameter("name"));
		response.getWriter().print(new Random().nextInt(100));

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		/*
		 * if ("GET".equalsIgnoreCase(arg0.getMethod())) { doGet(arg0, arg1); }
		 * System.out.println("£¨£¨£¨£¨"); Cookie u=new Cookie("u",
		 * "{'name':'zs','age'=1}"); u.setMaxAge(3600*24); arg1.addCookie(u);
		 */
	}

}
