package com.yc.framework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class BaseController {

	@RequestMapping("{page}")
	public String jumpPage(@PathVariable String page) {
		return page;// menu
	}

}
