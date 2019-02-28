package com.accenture.springboot.demo.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String hello()
	{
		return "hello, welcome to spring boot.lanlkf";
	}
}
