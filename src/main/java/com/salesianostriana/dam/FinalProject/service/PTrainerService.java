package com.salesianostriana.dam.FinalProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;
import com.salesianostriana.dam.FinalProject.repositories.PTrainerRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class PTrainerService
	extends BaseServiceImp<PersonalTrainer, Long, PTrainerRepository>{
	
	public List<PersonalTrainer> findByName(String nombre){
		return this.repository.findByNombreContainsIgnoreCase(nombre);
	}
	
	public List<PersonalTrainer> findByVal(int val){
		return this.repository.findByValoracion(val);
	}
}
