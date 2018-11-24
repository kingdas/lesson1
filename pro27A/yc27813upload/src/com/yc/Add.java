package com.yc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String n = (String) request.getParameter("n");
		String sn = (String) request.getSession().getAttribute("sn");
		if (n.equals(sn)) {
			DbUtils.executeCUD("insert into t_user(name,tel,group_id)values( '"
					+ request.getParameter("name") + "' ,'111',1)");
			request.getSession().removeAttribute("sn");
			System.out.println("ok");
		} else {
			System.out.println("err");
		}

	}

}
