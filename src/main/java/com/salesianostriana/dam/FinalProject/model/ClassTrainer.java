package com.salesianostriana.dam.FinalProject.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassTrainer {
	@Id
	@GeneratedValue
	private Long codTrabajador;
	
	private String nombre, apellidos, dni, cuentaBanco, numTelefono, urlImg;
	private double salario, dineroExtra;
	private int experiencia;
	
	@OneToMany(mappedBy="ct", fetch=FetchType.EAGER)
	@Builder.Default
	private List<Room> salas = new ArrayList<>();
}
