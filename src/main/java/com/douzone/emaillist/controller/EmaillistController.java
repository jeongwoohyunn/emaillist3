package com.douzone.emaillist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmaillistController {

	@ResponseBody
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
