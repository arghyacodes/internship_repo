package com.example.MyFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
	
	
	@GetMapping("test")
	public String welcome() {
		return "Simple Actuator Response";
	}
	
}
