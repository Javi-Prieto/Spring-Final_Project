package com.salesianostriana.dam.FinalProject.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.Deadlift;
import com.salesianostriana.dam.FinalProject.repositories.DLRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class DLService 
	extends BaseServiceImp<Deadlift, Long, DLRepository>{
	
	public double calculateRM(Deadlift dl) {
		return dl.getKgs()/(1.0278 - 0.0278 * dl.getReps());
	}
}
