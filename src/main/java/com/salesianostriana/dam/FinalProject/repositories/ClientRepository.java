package com.salesianostriana.dam.FinalProject.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.FinalProject.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	Optional<Client> findFirstByUsername(String username);
}
