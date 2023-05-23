package com.salesianostriana.dam.FinalProject.service;



import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.ClassTrainer;
import com.salesianostriana.dam.FinalProject.repositories.CTrainerRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service

public class CTrainerService 
	extends BaseServiceImp<ClassTrainer, Long, CTrainerRepository>{
	
	public ClassTrainer selectRandomCTrainer() {
		List <ClassTrainer> rndSort = findAll();
		Collections.shuffle(rndSort);
		return rndSort.get(0);
	}
	
	
}
