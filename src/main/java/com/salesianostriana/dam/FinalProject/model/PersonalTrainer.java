package com.salesianostriana.dam.FinalProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonalTrainer {
	@Id
	@GeneratedValue
	private Long codTrabajador;
	
	private String nombre, apellidos, dni, cuentaBanco, numTelefono, titulo, urlImg;
	private double salario;
	private int experiencia;
}
