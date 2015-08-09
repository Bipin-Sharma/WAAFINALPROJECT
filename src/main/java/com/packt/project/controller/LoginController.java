package com.packt.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value = { "/login" })
	public String login() {
		return "login";

	}

	@RequestMapping(value = { "/loginfailed" })
	public String loginfailed(Model model) {
		model.addAttribute("error", "true");
		return "login";
	}

	@RequestMapping(value = { "/logout" })
	public String logout(Model model) {

		return "welcome";
		}
}
