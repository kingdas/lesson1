package com.yc;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// jdbc
		String name = request.getParameter("name");
		System.out.println(name);
		System.out.println(request.getParameter("t"));
		String t = "";
		if (new Random().nextInt(100) % 2 == 1) {
			t = "1";
		} else {
			t = "0";
		}
		response.getWriter().print(t);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
