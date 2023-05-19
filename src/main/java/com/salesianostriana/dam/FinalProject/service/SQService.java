package com.salesianostriana.dam.FinalProject.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.Squat;
import com.salesianostriana.dam.FinalProject.repositories.SQRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class SQService 
	extends BaseServiceImp<Squat, Long, SQRepository>{
	public double calculateRM(Squat sq) {
		return sq.getKgs()*(1+(0.025 * sq.getReps()));
	}
}
