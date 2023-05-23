package com.salesianostriana.dam.FinalProject.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.Manage;
import com.salesianostriana.dam.FinalProject.model.Reserve;
import com.salesianostriana.dam.FinalProject.model.Room;
import com.salesianostriana.dam.FinalProject.repositories.ManageRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class ManageService 
	extends BaseServiceImp<Manage, Long, ManageRepository>{
	@Autowired
	private CTrainerService c;
	
	public void addManage(Room r, List<Reserve> res, Manage m) {
		if(res.isEmpty()) {
			m.setHoraInicio(LocalDateTime.of(LocalDate.now(), LocalTime.of(9, 0)));
			m.setHoraSalida(LocalDateTime.of(LocalDate.now(), LocalTime.of(22, 0)));
			m.setRoom(r);
			m.setTrainer(c.selectRandomCTrainer());
			save(m);
		}
	}
	public void removeManage(Room r, List<Reserve> res, Manage m) {
		if(res.isEmpty()) {
			
			m.removeRoom(r);
			m.removeTrainer(c.selectRandomCTrainer());
			delete(m);
		}
	}
}
