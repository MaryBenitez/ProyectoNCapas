package com.uca.capas.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
}
