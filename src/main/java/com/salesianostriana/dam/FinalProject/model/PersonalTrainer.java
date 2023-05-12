package com.salesianostriana.dam.FinalProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

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
	
	private String nombre, apellidos, dni, cuentaBanco, numTelefono, titulo,  email;
	@Lob
	private String urlImg;
	private double precioMensual;
	private int experiencia;
	private int valoracion;
}
