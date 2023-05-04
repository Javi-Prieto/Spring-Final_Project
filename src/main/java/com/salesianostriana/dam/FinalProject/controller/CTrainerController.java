package com.salesianostriana.dam.FinalProject.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.ClassTrainer;
import com.salesianostriana.dam.FinalProject.service.CTrainerService;

@Controller
public class CTrainerController {
	@Autowired
	private CTrainerService service;
	
	@GetMapping("/Ctrainer")
	public String showCTrainer(Model model) {
		model.addAttribute("CTrainerList", service.findAll());
		
		return "CTrainer";
	}
	
	@GetMapping("/admin/CtrainerList")
	public String showAdminCTrainer(Model model) {
		model.addAttribute("CTrainerList", service.findAll());
		
		return "CTrainerAdmin";
	}
	
	
	@GetMapping("/admin/add/CTrainerForm")
	public String showCTrainerAddForm(Model model) {
		ClassTrainer cTrainer = new ClassTrainer();
		model.addAttribute("cTrainerForm", cTrainer);
		return "TrainerForm";
	}
	
	@PostMapping("/admin/add/CTrainerForm/submit")
	public String submitAddForm(@ModelAttribute("cTrainerForm") ClassTrainer cTrainer, Model model) {
		model.addAttribute("CTrainer", cTrainer);
		
		return "redirect:/admin/CtrainerList";
	}
	
	@GetMapping("/admin/edit/CTrainerForm/{codTrabajador}")
	public String showCTrainerEditForm(@PathVariable("codTrabajador") Long codTrab, Model model) {
		Optional<ClassTrainer> forEdit = service.findById(codTrab);
		
		if(forEdit.isPresent()) {
			model.addAttribute("CTrainerForm", forEdit.get());
			
			return "TrainerForm";
		}else {
			return "redirect:/admin/CTrainerList";
		}
	
	}
	@PostMapping("/admin/edit/CTrainerForm/submit")
	public String procesarFormularioEdicion(@ModelAttribute("cTrainerForm") ClassTrainer a) {
		service.edit(a);
		return "redirect:/admin/CTrainerList";
	}
	
}
