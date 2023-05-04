package com.salesianostriana.dam.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.ClassTrainer;
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
	
	@GetMapping("/admin/CtrainerList")
	public String showAdminCTrainer(Model model) {
		model.addAttribute("CTrainerList", service.findAll());
		
		return "CTrainerAdmin";
	}
	
	
	@GetMapping("/admin/CTrainerForm")
	public String showCTrainerForm(Model model) {
		ClassTrainer cTrainer = new ClassTrainer();
		model.addAttribute("CTrainerForm", cTrainer);
		return "TrainerForm";
	}
	
	@PostMapping("/admin/CTrainerList")
	public String submitForm(@ModelAttribute("CTrainerForm") ClassTrainer cTrainer, Model model) {
		model.addAttribute("CTrainer", cTrainer);
		
		return "CTrainerAdmin";
	}
	
}
