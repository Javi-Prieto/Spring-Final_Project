package com.salesianostriana.dam.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.FinalProject.service.CTrainerService;

@Controller

public class CTrainerController {
	@Autowired
	private CTrainerService serv;
	
	@GetMapping("/CTrainer")
	public String mostrarEntrenadores(Model m) {
		int[] cuatro = new int[3];
		m.addAttribute("CTrainerList", serv.getTempList());
		m.addAttribute("cuatro", cuatro);
		
		return "ctrainer.html";
	}
	
}
