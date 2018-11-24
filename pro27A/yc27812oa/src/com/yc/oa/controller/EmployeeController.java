package com.yc.oa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.framework.BaseController;
import com.yc.oa.model.Employee;
import com.yc.oa.service.EmployeeService;

@Controller
@RequestMapping("emp")
public class EmployeeController  {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("login")
	public String login(Employee emp, HttpSession s) {
		Employee e = employeeService.login(emp);
		if (e != null) {
			s.setAttribute("emp", e);
			return "index";
		}
		return "redirect:/login.jsp";
	}

}
