package com.back.cadarpiodigitalback.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/food")
public class foodController {
	
	@GetMapping
	public void getall() {
		
	}
	
}
