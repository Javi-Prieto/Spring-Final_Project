package com.salesianostriana.dam.FinalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;
import com.salesianostriana.dam.FinalProject.repositories.PTrainerRepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PTrainerService {
	@Autowired
	private PTrainerRepository repo;
	
	public List<PersonalTrainer> getLista(){
		return repo.findAll();
	}
}
