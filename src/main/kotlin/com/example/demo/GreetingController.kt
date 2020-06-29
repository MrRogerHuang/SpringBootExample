package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*

@Controller
class GreetingController {
	@GetMapping("/greeting")
	fun greeting(@RequestParam(name="name", required=false, defaultValue="World") name: String, model: Model): String {
		model.addAttribute("name", name);
		return "thymeleaf/greeting";
	}

	@GetMapping("/greeting2")
	fun greeting2(@RequestParam(name="name", required=false, defaultValue="World") name: String, model: Model): String {
		model.addAttribute("name", name);
		return "views/greeting2";
	}
}
