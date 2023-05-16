package com.salesianostriana.dam.FinalProject.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.model.Hire;
import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;
import com.salesianostriana.dam.FinalProject.service.HireService;
import com.salesianostriana.dam.FinalProject.service.PTrainerService;

@Controller
public class HireController {
	@Autowired
	private HireService servicio;
	@Autowired
	private PTrainerService pServicio;
	
	@PostMapping("/hirePTrainer/{codTrabajador}")
	public String submitHire(@ModelAttribute("newHire")Hire h, @AuthenticationPrincipal Client cliente, @PathVariable("codTrabajador") Long trainerId) {
		PersonalTrainer editP = pServicio.findById(trainerId).get();
		List<Hire> clientsList = editP.getClientes();
		clientsList.add(h);
		h.setTrainer(pServicio.findById(trainerId).get());
		h.setCliente(cliente);
		h.setStartHire(LocalDate.now());
		h.setFinishHire(h.getStartHire().plusMonths(1));
		servicio.save(h);
		editP.setClientes(clientsList);
		pServicio
			.edit(editP);
		cliente.setHirePtrainer(h);
		
		return "redirect:/ptrainerlist";
	}
}
