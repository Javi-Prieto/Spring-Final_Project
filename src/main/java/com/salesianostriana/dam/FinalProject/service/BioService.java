package com.salesianostriana.dam.FinalProject.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.Biometrics;
import com.salesianostriana.dam.FinalProject.repositories.BioRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class BioService 
	extends BaseServiceImp<Biometrics, Long, BioRepository>{

}
