package com.jeewan.springbootapp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
	
	@RequestMapping("/welcome")
	public String greeting(){
		return "<html>"
				+"<head>"
				+"<h1><center>Welcome to my Spring-Boot app-V2.........!!!!!!!!!!! </Center></h1>"
				+ "<h6>Jeewan</h6>";
				
	}

}
