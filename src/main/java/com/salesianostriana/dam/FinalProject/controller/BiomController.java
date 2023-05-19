package com.salesianostriana.dam.FinalProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.Biometrics;
import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.service.BioService;
import com.salesianostriana.dam.FinalProject.service.ClientService;

@Controller
public class BiomController {
	@Autowired
	private BioService bService;
	@Autowired
	private ClientService cService;
	
	@GetMapping("/mypage/biometrics")
	public String showBiom( Model m) {
		m.addAttribute("bList", bService.findAll());
		m.addAttribute("cServ", cService);
		return "biometrics";	
	}
	
	@GetMapping("/mypage/biometrics/add")
	public String showFormBio(@AuthenticationPrincipal Client client ,Model m) {
		Biometrics bioForm = new Biometrics();
		bioForm.setClienteF(client);
		m.addAttribute("bioForm", bioForm);
		return "bioForm";
	}
	@PostMapping("/mypage/biometrics/add/submit")
	public String submitBio(@ModelAttribute("bioForm") Biometrics b) {
		
		bService.save(b);
		return "redirect:/mypage/biometrics";
	}
	
	@GetMapping("/mypage/biometrics/edit/{idBio}")
	public String showEditBio(@PathVariable("idBio") Long idBio, Model m) {
		Optional <Biometrics> forEdit = bService.findById(idBio);
		if(forEdit.isPresent()) {
			m.addAttribute("bioForm", forEdit.get());
			return "bioForm";
		}else {
			return "redirect:/mypage/biometrics";
		}
	}
	@PostMapping("/mypage/biometrics/edit/submit")
	public String submitBenchEdit(@ModelAttribute("bioForm")Biometrics b) {
		bService.edit(b);
		return "redirect:/mypage/biometrics";
	}
	
	@GetMapping("/mypage/biometrics/delete/{idBio}")
	public String deleteBench(@PathVariable("idBio") long id) {
		bService.deleteById(id);
		return "redirect:/mypage/biometrics";
	}
}
