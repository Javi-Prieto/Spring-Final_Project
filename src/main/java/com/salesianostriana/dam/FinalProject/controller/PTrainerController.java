package com.salesianostriana.dam.FinalProject.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.FinalProject.model.Hire;
import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;
import com.salesianostriana.dam.FinalProject.service.PTrainerService;

@Controller
public class PTrainerController {
	@Autowired
	private PTrainerService service;
	
	@GetMapping("/ptrainerlist")
	public String showPtrainer(Model model) {
		Hire newHire = new Hire();
		model.addAttribute("pTrainerList", service.findAll());
		model.addAttribute("newHire", newHire);
		return "PTrainer";
	}
	
	@GetMapping("/admin/ptrainerlist")
	public String showAdminPtrainer(Model model) {
		model.addAttribute("pTrainerList", service.findAll());
		return"PTrainerAdmin";
	}
	@GetMapping("/admin/add/ptrainer")
	public String showPTrainerAddForm(Model model) {
		PersonalTrainer pTrainer = new PersonalTrainer();
		model.addAttribute("pTrainerForm", pTrainer);
		return "PTrainerForm";
	}
	
	@PostMapping("/admin/add/ptrainer/submit")
	public String submitAddPtrainer(@ModelAttribute("pTrainerForm")PersonalTrainer p) {
		Random rnd = new Random();
		p.setValoracion(rnd.nextInt(0, 5));
		service.save(p);
		
		return "redirect:/admin/ptrainerlist";
	}
	
	@GetMapping("/admin/edit/ptrainerform/{codTrabajador}")
	public String showPTrainerEditForm(@PathVariable("codTrabajador") Long codTrab, Model model) {
		Optional<PersonalTrainer> forEdit = service.findById(codTrab);
		
		if(forEdit.isPresent()) {
			model.addAttribute("pTrainerForm", forEdit.get());
			return "PTrainerForm";
		}else {
			return "redirect:/admin/ptrainerlist";
		}
	
	}
	
	@PostMapping("/admin/edit/ptrainerform/submit")
	public String submitFormularioEdicion(@ModelAttribute("pTrainerForm") PersonalTrainer a) {
		service.edit(a);
		return "redirect:/admin/ptrainerlist";
	}
	
	@GetMapping("/admin/delete/ptrainer/{codTrabajador}")
	public String deletePTrainer(@PathVariable("codTrabajador") long id) {
		service.deleteById(id);
		return "redirect:/admin/ptrainerlist";
	}
	
	@GetMapping("/ptrainer/search/1")
	public String buscarNombre(@RequestParam("nombre")String nombre, Model m) {
		List <PersonalTrainer> newList;
		newList = service.findByName(nombre);
		m.addAttribute("pTrainerList", newList);
		Hire newHire = new Hire();
		m.addAttribute("newHire", newHire);
		return "PTrainer";
	}
	
	@GetMapping("/ptrainer/search/2")
	public String buscarValoracion(@RequestParam("val")int val, Model m) {
		List <PersonalTrainer> newList;
		newList = service.findByVal(val);
		m.addAttribute("pTrainerList", newList);
		Hire newHire = new Hire();
		m.addAttribute("newHire", newHire);
		return "PTrainer";
	}
}
