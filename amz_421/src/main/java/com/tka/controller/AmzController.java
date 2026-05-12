package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AmzController 
{
	@GetMapping("/")
	public String indexpage()
	{
		return "index"; //index.jsp
	}
	
	@GetMapping("/login")
	public String loginpage()
	{
		return "login"; //login.jsp
	}
	
	@GetMapping("/register")
	public String registerpage()
	{
		return "register"; //register.jsp
	}
	
	@GetMapping("/home")
	public String homepage()
	{
		return"home"; 
	}

	
}
