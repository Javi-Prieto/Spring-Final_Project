package com.salesianostriana.dam.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.FinalProject.model.Reserve;
import com.salesianostriana.dam.FinalProject.service.RoomService;

@Controller
public class RoomController {
	@Autowired
	private RoomService service;
	
	@GetMapping("/room")
	public String showRoomPage(Model m) {
		Reserve res = new Reserve();
		m.addAttribute("newReserve", res);
		m.addAttribute("sala", service.findAll().get(0));
		return "Sala";
	}
}
