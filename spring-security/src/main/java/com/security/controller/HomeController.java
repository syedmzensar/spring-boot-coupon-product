package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String sayHello() {
		return "<h1>Hello </h1>";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "<h1> Welcome to admin dashboard</h1>";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "<h1> Welcome to user dashboard</h1>";
	}
	
}
