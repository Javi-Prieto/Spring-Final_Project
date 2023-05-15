package com.salesianostriana.dam.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.Hire;
import com.salesianostriana.dam.FinalProject.repositories.ClientRepository;
import com.salesianostriana.dam.FinalProject.service.HireService;

@Controller
public class HireController {
	@Autowired
	private HireService servicio;
	@Autowired
	private ClientRepository cService;
	
	@PostMapping("/hirePTrainer")
	public String submitHire(@ModelAttribute("newHire")Hire h, Authentication auth) {
		h.setCliente(cService.findFirstByUsername(auth.getName()).get());
		servicio.save(h);
		
		return "redirect:/ptrainerlist";
	}
}
