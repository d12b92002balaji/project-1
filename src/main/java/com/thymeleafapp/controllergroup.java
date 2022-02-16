package com.thymeleafapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllergroup {
	
	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("meet","hello world");
		return "index";
	}

}
