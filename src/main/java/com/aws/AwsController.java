package com.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AwsController {
	@GetMapping(value="/aws")
	public String post() {
		return "I am fullstack developer";
		
	}
}
