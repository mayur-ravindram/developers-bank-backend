package com.dev.bank.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

	@GetMapping("ping")
	public HttpStatus healthCheck() {
		return HttpStatus.OK;
	}
}
