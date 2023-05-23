package com.salesianostriana.dam.FinalProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;


public interface PTrainerRepository extends JpaRepository<PersonalTrainer, Long> {

	List<PersonalTrainer> findByNombreContainingIgnoreCase(String nombre);
	
	/*Query("select p from Personal_Trainer p where p.valoracion = ?1")
	public List<PersonalTrainer> findByValoracion(int Valoracion);*/
}
