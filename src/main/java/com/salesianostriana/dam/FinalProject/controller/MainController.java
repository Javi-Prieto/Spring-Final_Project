package com.salesianostriana.dam.FinalProject.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.service.ClientService;

@Controller
public class MainController {
	@Autowired
	private ClientService serviceC;
	@GetMapping("/")
	public String showIndex(@AuthenticationPrincipal Client cliente) {
		if(cliente != null && cliente.getCancelDate().equals(LocalDate.now()))
			serviceC.delete(cliente);
		return "portada";
	}
	@GetMapping("/login")
	public String showLogIn() {
		return "logIn";
	}
}
