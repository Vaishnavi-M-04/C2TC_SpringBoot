package com.tnsif.SpringBoot.RestFul_API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/hello")
	public String welcome()
	{
		return "WELCOME CODERZZZ FOR THE RESTFUL API IN SPRING...";
	}

}
