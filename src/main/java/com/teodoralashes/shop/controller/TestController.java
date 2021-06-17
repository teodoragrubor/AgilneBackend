package com.teodoralashes.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/tests")
@RestController
public class TestController {
	
	@GetMapping
	public String handleGetAll() 
	{
		return "Zdravo svima";
	}
	
}
