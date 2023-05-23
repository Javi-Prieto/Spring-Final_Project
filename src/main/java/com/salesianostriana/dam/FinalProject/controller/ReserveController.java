package com.salesianostriana.dam.FinalProject.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.model.Reserve;
import com.salesianostriana.dam.FinalProject.service.ReserveService;
import com.salesianostriana.dam.FinalProject.service.RoomService;

@Controller
public class ReserveController {
	@Autowired
	private ReserveService service;
	@Autowired
	private RoomService serviceR;
	
	@PostMapping("/reserve/submit/{codSala}")
	public String  submitReserve(@ModelAttribute("newReserve") Reserve r, @AuthenticationPrincipal Client cliente, @PathVariable("codSala") Long salaId) {
		
		if(serviceR.findById(salaId).isPresent()) {
			r.setHoraEntrada(LocalDateTime.of(LocalDate.now(), LocalTime.of(9, 0)));
			r.setHoraSalida(LocalDateTime.of(LocalDate.now(), LocalTime.of(22, 0)));
			r.addCliente(cliente);
			r.addRoom(serviceR.findById(salaId).get());
			service.save(r);
			return "redirect:/mypage/hirereserve";
		}else {
			return "/room";
		}
		
	}
	@GetMapping("/reserve/delete/{idRes}")
	public String deleteReserve(@PathVariable("idRes")long idRes, @AuthenticationPrincipal Client cliente) {
		Optional <Reserve> reserv = service.findById(idRes);
		if(reserv.isPresent()){
			service.findById(idRes).get().removeCliente(cliente);
			service.findById(idRes).get().removeRoom(service.findById(idRes).get().getRoom());
			service.deleteById(idRes);
			return "redirect:/mypage/hirereserve";
		}else {
			return "redirect:/mypage/hirereserve";
		}
	}
	
	
}
