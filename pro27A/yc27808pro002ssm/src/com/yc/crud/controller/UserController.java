package com.yc.crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yc.crud.model.UserModel;
import com.yc.crud.model.UserQueryModel;
import com.yc.crud.service.UserService;
import com.yc.crud.service.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;// = new UserServiceImpl();

	@RequestMapping("findByNameOrStatus")
	public String findByNameOrStatus(UserQueryModel uq, Model m) {
		m.addAttribute("us", userService.findByNameOrStatus(uq));
		return "userList";
	}

	@RequestMapping("nameExists/{name}")
	public String nameExists(@PathVariable String name, HttpServletResponse resp) {
		String s = "";
		if (userService.nameExists(name)) {
			s = "1";
		} else {
			s = "0";
		}
		try {
			resp.getWriter().print(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(UserModel u) {
		userService.update(u);
		return "redirect:/user/list";
	}

	@RequestMapping("update/{operator_id}")
	public String update(@PathVariable int operator_id, Model m) {
		m.addAttribute("u", userService.findById(operator_id));
		return "userUpdate";
	}

	@RequestMapping("del/{operator_id}")
	public String del(@PathVariable int operator_id) {
		userService.del(operator_id);
		return "redirect:/user/list";
	}

	@RequestMapping("add")
	public String add() {
		return "userAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(UserModel u, HttpServletResponse resp) {
		userService.add(u);
		// 提示成功，弹窗关，显示刷新
		try {
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
			resp.getWriter()
					.print("<script>alert('恭喜，增加成功');close();opener.location.href='/yc27808pro002ssm/user/list'</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model m) {
		m.addAttribute("us", userService.findAll());
		return "userList";
	}

}
