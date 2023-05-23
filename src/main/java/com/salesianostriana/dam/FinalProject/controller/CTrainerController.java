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

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CTrainerController {
	@Autowired
	private CTrainerService service;
	
	
	
	@GetMapping("/ctrainerlist")
	public String showCTrainer(Model model) {
		model.addAttribute("CTrainerList", service.findAll());
		
		return "CTrainer";
	}
	
	@GetMapping("/admin/ctrainerlist")
	public String showAdminCTrainer(Model model) {
		model.addAttribute("CTrainerList", service.findAll());
		
		return "CTrainerAdmin";
	}
	
	
	@GetMapping("/admin/add/ctrainerform")
	public String showCTrainerAddForm(Model model) {
		ClassTrainer cTrainer = new ClassTrainer();
		model.addAttribute("cTrainerForm", cTrainer);
		return "TrainerForm";
	}
	
	@PostMapping("/admin/add/ctrainerform/submit")
	public String submitAddForm(@ModelAttribute("cTrainerForm") ClassTrainer cTrainer) {
		service.save(cTrainer);
		
		return "redirect:/admin/ctrainerlist";
	}
	
	@GetMapping("/admin/edit/ctrainerform/{codTrabajador}")
	public String showCTrainerEditForm(@PathVariable("codTrabajador") Long codTrab, Model model) {
		Optional<ClassTrainer> forEdit = service.findById(codTrab);
		
		if(forEdit.isPresent()) {
			model.addAttribute("cTrainerForm", forEdit.get());
			return "TrainerForm";
		}else {
			return "redirect:/admin/ctrainerlist";
		}
	
	}
	@PostMapping("/admin/edit/ctrainerform/submit")
	public String procesarFormularioEdicion(@ModelAttribute("cTrainerForm") ClassTrainer a) {
		service.edit(a);
		return "redirect:/admin/ctrainerlist";
	}
	
	@GetMapping("/admin/delete/ctrainer/{codTrabajador}")
	public String deleteCTrainer(@PathVariable("codTrabajador") long id) {
		service.deleteById(id);
		return "redirect:/admin/ctrainerlist";
	}
	
}
