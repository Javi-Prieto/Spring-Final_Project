package com.salesianostriana.dam.FinalProject.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.model.Reserve;
import com.salesianostriana.dam.FinalProject.model.Room;
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
			
			Room editR = serviceR.findById(salaId).get();
			List<Reserve> clienList = editR.getClients();
			clienList.add(r);
			r.setCliente(cliente);
			r.setHoraEntrada(LocalDateTime.now());
			r.setHoraSalida(LocalDateTime.now().plusHours(8));
			r.setRoom(editR);
			service.save(r);
			serviceR.edit(editR);
			cliente.setRoomReserve(r);
			return "redirect:/mypage/hirereserve";
		}else {
			return "/room";
		}
		
	}
}
