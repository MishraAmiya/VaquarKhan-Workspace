package com.finleashed.phase1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home_finleashed")
	public String home() {
		return "index";
	}

}
