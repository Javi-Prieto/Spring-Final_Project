package com.salesianostriana.dam.FinalProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;

@Repository
public interface PTrainerRepository extends JpaRepository<PersonalTrainer, Long> {

}
