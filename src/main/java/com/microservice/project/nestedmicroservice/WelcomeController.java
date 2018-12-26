package com.microservice.project.nestedmicroservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@Value("${server.port}")
	private String port;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String rootMessage() {
		return "okies"+port;
	}

	@RequestMapping(value="/name", method=RequestMethod.GET)
	public String nameMessage() {
		return "service running on "+port;
	}
}
