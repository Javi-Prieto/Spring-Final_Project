package com.salesianostriana.dam.FinalProject.service;



import java.util.Arrays;
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
	public List<ClassTrainer> getTempList(){
		return Arrays.asList(
					ClassTrainer.builder()
					.nombre("Juan")
					.apellidos("Perez Prieto")
					.dni("54189142D")
					.cuentaBanco("ES1253566414")
					.experiencia(2)
					.numTelefono("685732502")
					.descripcion("hola soy una persona muy real y personal")
					.build(),
					ClassTrainer.builder()
					.nombre("Juan")
					.apellidos("Perez Prieto")
					.dni("54189142D")
					.cuentaBanco("ES1253566414")
					.experiencia(2)
					.numTelefono("685732502")
					.descripcion("hola soy una persona muy real y personal")
					.build(),
					ClassTrainer.builder()
					.nombre("Juan")
					.apellidos("Perez Prieto")
					.dni("54189142D")
					.cuentaBanco("ES1253566414")
					.experiencia(2)
					.numTelefono("685732502")
					.descripcion("hola soy una persona muy real y personal")
					.build(),
					ClassTrainer.builder()
					.nombre("Juan")
					.apellidos("Perez Prieto")
					.dni("54189142D")
					.cuentaBanco("ES1253566414")
					.experiencia(2)
					.numTelefono("685732502")
					.descripcion("hola soy una persona muy real y personal")
					.build(),
					ClassTrainer.builder()
					.nombre("Juan")
					.apellidos("Perez Prieto")
					.dni("54189142D")
					.cuentaBanco("ES1253566414")
					.experiencia(2)
					.numTelefono("685732502")
					.descripcion("hola soy una persona muy real y personal")
					.build()
				);
	}
}
