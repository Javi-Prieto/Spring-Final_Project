package com.salesianostriana.dam.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.FinalProject.service.CTrainerService;

@Controller
public class CTrainerController {
	@Autowired
	private CTrainerService service;
	
	@GetMapping("/CtrainerList")
	public String showCTrainer(Model model) {
		model.addAttribute("CTrainerList", service.findAll());
		
		return "CTrainer";
	}
	
}
