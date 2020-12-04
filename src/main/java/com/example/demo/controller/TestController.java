package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String test() {
		return "plantillas/base";
	}

	@GetMapping("/herencia")
	public String herencia() {
		return "test";
	}

}
