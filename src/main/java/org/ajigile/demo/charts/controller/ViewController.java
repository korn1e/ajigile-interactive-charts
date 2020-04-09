package org.ajigile.demo.charts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	
	@GetMapping("/")
	public String index(){
		return "dashboard";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(){
		return "dashboard";
	}
}
