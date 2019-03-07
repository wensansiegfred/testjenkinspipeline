package com.ms3.springbootdockertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(name = "/")
	public String getIndex() {
		return "Hello World from Docker Image.";
	}
}
