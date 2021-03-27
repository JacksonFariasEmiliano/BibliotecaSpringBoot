package com.crud.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AutorController {

	@GetMapping("/autor")
	public String teste() {
		return "teste";
	}
}
