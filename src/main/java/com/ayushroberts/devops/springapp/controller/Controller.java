package com.ayushroberts.devops.springapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Controller {

	@GetMapping("/api/hi/{param}")
	public String controllerEndpoint(@PathVariable String param) {
		return "Hi".concat(param);
	}

}
