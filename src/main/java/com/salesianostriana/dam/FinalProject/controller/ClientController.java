package com.salesianostriana.dam.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.repositories.ClientRepository;
import com.salesianostriana.dam.FinalProject.service.ClientService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ClientController {
	@Autowired
	private ClientService servicio;
	private final PasswordEncoder passwordEncoder;
	
	@GetMapping("/register")
	public String showRegisterForm(Model m) {
		Client newCliente = new Client();
		m.addAttribute("cliente", newCliente);
		return "registerForm";
	}
	
	@PostMapping("/register/submit")
	public String submitRegisterForm(@ModelAttribute("cliente") Client cliente) {
		cliente.setPassword(passwordEncoder.encode(cliente.getPassword()));
		servicio.save(cliente);
		return "redirect:/";
	}
}