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
public class ClassTrainer {
	@Id
	@GeneratedValue
	private Long codTrabajador;
	
	private String nombre, email, apellidos, dni, cuentaBanco, numTelefono;
	@Lob
	private String desc, urlImg;
	private double salario;
	private int experiencia;
	
	/*@OneToMany(mappedBy="ct", fetch=FetchType.EAGER)
	@Builder.Default
	private List<Room> salas = new ArrayList<>();*/
}
