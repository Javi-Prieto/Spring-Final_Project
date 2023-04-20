package com.salesianostriana.dam.FinalProject.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.ClassTrainer;
import com.salesianostriana.dam.FinalProject.repositories.CTrainerRepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CTrainerService {
	
	@Autowired
	private CTrainerRepository repo;
	
	public List<ClassTrainer> getLista(){
		return repo.findAll();
	}
}
