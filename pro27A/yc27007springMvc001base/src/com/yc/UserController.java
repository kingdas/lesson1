package com.yc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	@RequestMapping("add")
	public String add() {
		System.out.println("ADD");
		return "userList";
	}

	public static void main(String[] args) {
		UserController uc = new UserController();
		uc.add();
	}

}
