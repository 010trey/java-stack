package com.teje.Daikichi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@GetMapping
	public String welcome() {
	    return "Welcome!";
	}

	@GetMapping("/today")
	public String today() {
	    return "Today you will find luck in all your endeavors!";
	}

	@GetMapping("/tomorrow")
	public String tomorrow() {
	    return "Tomorrow is full of possibilities!";
	}

   
	
}

