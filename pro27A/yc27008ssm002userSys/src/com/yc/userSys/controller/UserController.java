package com.yc.userSys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.userSys.dao.GroupDao;
import com.yc.userSys.dao.UserDao;
import com.yc.userSys.model.GroupModel;
import com.yc.userSys.model.UserModel;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	UserDao userDao;
	@Autowired
	GroupDao groupDao;

	@RequestMapping("add")
	public String add(Model m) {
		List<GroupModel> gs = groupDao.findAll();
		m.addAttribute("gs", gs);
		return "userAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(UserModel u) {
		userDao.add(u);
		return "redirect:/user/list";
	}

	@RequestMapping("list")
	public String list(Model m) {
		List<UserModel> us = userDao.findAll();
		m.addAttribute("us", us);
		return "userList";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(UserModel u) {
		userDao.update(u);
		return "redirect:/user/list";
	}

	@RequestMapping("update")
	public String update(int id, Model m) {
		UserModel u = userDao.findById(id);
		m.addAttribute("u", u);
		List<GroupModel> gs = groupDao.findAll();
		m.addAttribute("gs", gs);
		return "userUpdate";
	}

	// user/del/1
	@RequestMapping("del/{id}")
	public String del(@PathVariable int id) {
		userDao.del(id);
		return "redirect:/user/list";
	}

	public String t1(HttpServletRequest req) {
		req.setAttribute("x", 5);
		return null;
	}

	@ResponseBody
	@RequestMapping("testJson")
	public UserModel testJson() {
		UserModel u = userDao.findById(12);
		System.out.println(u);
		return u;
	}

	@ResponseBody
	@RequestMapping("getUs")
	public List<UserModel> getUs() {
		List<UserModel> us = userDao.findAll();
		return us;
	}

}
