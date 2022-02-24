package com.firstApi.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping(path = { "/Ola" })
	public String ola() {
		return "Olá Spring Boot";
	}
}
