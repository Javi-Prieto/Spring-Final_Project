package com.salesianostriana.dam.FinalProject.service;




import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.BenchPress;
import com.salesianostriana.dam.FinalProject.repositories.BPRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class BPService 
	extends BaseServiceImp<BenchPress, Long, BPRepository>{

	public double calculateRM(BenchPress bp) {
		return bp.getKgs()/(1.0278 - 0.0278 * bp.getReps());
	}
}
