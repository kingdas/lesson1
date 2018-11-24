package com.yc.crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.crud.model.UserModel;
import com.yc.crud.model.UserQueryModel;
import com.yc.crud.service.UserService;
import com.yc.crud.service.UserServiceImpl;

public class UserController extends HttpServlet {
	private UserService userService = new UserServiceImpl();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String m = request.getParameter("m");
		if ("add".equals(m)) {
			add(request, response);
		} else if ("del".equals(m)) {
			del(request, response);
		} else if ("update".equals(m)) {
			update(request, response);
		} else if ("doUpdate".equals(m)) {
			doUpdate(request, response);
		} else if ("nameExists".equals(m)) {
			nameExists(request, response);
		} else if ("findByNameOrStatus".equals(m)) {
			findByNameOrStatus(request, response);
		} else {
			list(request, response);
		}

	}

	private void findByNameOrStatus(HttpServletRequest request,
			HttpServletResponse response) {
		UserQueryModel uq = new UserQueryModel();
		uq.setName(request.getParameter("name"));
		uq.setStatus(Integer.parseInt(request.getParameter("status")));
		request.setAttribute("us", userService.findByNameOrStatus(uq));
		try {
			request.getRequestDispatcher("jsp/userList.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void nameExists(HttpServletRequest request,
			HttpServletResponse response) {
		String s = "";
		if (userService.nameExists(request.getParameter("name"))) {
			s = "1";
		} else {
			s = "0";
		}
		try {
			response.getWriter().print(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(request.getParameter("t"));
	}

	private void doUpdate(HttpServletRequest request,
			HttpServletResponse response) {
		int operator_id = Integer.parseInt(request.getParameter("operator_id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int status = Integer.parseInt(request.getParameter("status"));
		UserModel u = new UserModel(operator_id, name, password, status);
		userService.update(u);
		list(request, response);
	}

	private void update(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("u", userService.findById(Integer.parseInt(request
				.getParameter("operator_id"))));
		try {
			request.getRequestDispatcher("jsp/userUpdate.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void del(HttpServletRequest request, HttpServletResponse response) {
		Integer operator_id = Integer.parseInt(request
				.getParameter("operator_id"));
		userService.del(operator_id);
		list(request, response);
	}

	private void add(HttpServletRequest request, HttpServletResponse response) {
		int operator_id = Integer.parseInt(request.getParameter("operator_id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int status = Integer.parseInt(request.getParameter("status"));
		UserModel u = new UserModel(operator_id, name, password, status);
		userService.add(u);
		//提示成功，弹窗关，显示刷新
		try {
			response.getWriter().print("<script>alert('恭喜，增加成功');close();opener.location.href='UserController'</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("us", userService.findAll());
		try {
			request.getRequestDispatcher("jsp/userList.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
