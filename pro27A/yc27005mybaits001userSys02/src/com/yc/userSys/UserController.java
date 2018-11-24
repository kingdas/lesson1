package com.yc.userSys;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("doget");
		request.setCharacterEncoding("utf-8");
		String m = request.getParameter("m");

		if ("add".equals(m)) {
			add(request, response);
		} else if ("addx".equals(m)) {
			addx(request, response);
		} else if ("del".equals(m)) {
			del(request, response);
		} else if ("update".equals(m)) {
			update(request, response);
		} else if ("doUpdate".equals(m)) {
			doUpdate(request, response);
		} else {
			list(request, response);
		}

	}

	UserDao userDao = new UserDaoMybatisImpl(); // new UserDaoImpl();
	GroupDao groupDao = new GroupDaoImpl();

	void addx(HttpServletRequest request, HttpServletResponse response) {
		List<GroupModel> gs = groupDao.findAll();
		request.setAttribute("gs", gs);
		try {
			request.getRequestDispatcher("userAdd.jsp").forward(request,
					response);
		} catch (Exception e) {

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	void list(HttpServletRequest request, HttpServletResponse response) {
		List<UserModel> us = userDao.findAll();
		request.setAttribute("us", us);

		List<GroupModel> gs = groupDao.findAll();
		GroupModel g = null;
		Map<Long, String> gsMap = new HashMap<Long, String>();
		for (int i = 0; i < gs.size(); i++) {
			g = gs.get(i);
			gsMap.put(g.getId() + 0L, g.getName());
		}
		request.setAttribute("gsMap", gsMap);
		try {
			request.getRequestDispatcher("userList.jsp").forward(request,
					response);
		} catch (Exception e) {

		}
	}

	void doUpdate(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String groupId = request.getParameter("group_id");
		int group_id = Integer.parseInt(groupId);
		UserModel u = new UserModel(id, name, tel, group_id);
		userDao.update(u);
		try {
			response.sendRedirect("controller");// 重定向
		} catch (Exception e) {

		}
	}

	void update(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		UserModel u = userDao.findById(id);
		request.setAttribute("u", u);
		List<GroupModel> gs = groupDao.findAll();
		request.setAttribute("gs", gs);
		try {
			request.getRequestDispatcher("userUpdate.jsp").forward(request,
					response);
		} catch (Exception e) {

		}
	}

	void del(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		userDao.del(id);
		try {
			response.sendRedirect("controller");// 重定向
		} catch (Exception e) {

		}
	}

	void add(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String groupId = request.getParameter("group_id");
		int group_id = Integer.parseInt(groupId);
		UserModel u = new UserModel(name, tel, group_id);
		userDao.add(u);
		try {
			response.sendRedirect("controller");// 重定向
		} catch (Exception e) {

		}
	}

	// public static void main(String[] args) {
	// UserController c = new UserController();
	// try {
	// c.doGet(null, null);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

}
