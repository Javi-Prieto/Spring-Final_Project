package com.salesianostriana.dam.FinalProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;


public interface PTrainerRepository extends JpaRepository<PersonalTrainer, Long> {

	List<PersonalTrainer> findByNombreContainsIgnoreCase(String nombre);
	
	@Query("select p from PersonalTrainer p where p.valoracion = ?1")
    List<PersonalTrainer> findByValoracion(int valoracion);
}
