package com.finleashed.phase1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigaionController {

	@RequestMapping("/pilligram")
	public String home() {
		return "pilligram";
	}

}
