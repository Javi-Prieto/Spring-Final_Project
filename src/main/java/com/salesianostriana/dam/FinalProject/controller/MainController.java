package com.salesianostriana.dam.FinalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String showIndex() {
		return "portada";
	}
	@GetMapping("/login")
	public String showLogIn() {
		return "logIn";
	}
}
