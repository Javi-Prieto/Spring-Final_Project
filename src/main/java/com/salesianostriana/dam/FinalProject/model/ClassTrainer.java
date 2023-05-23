package com.salesianostriana.dam.FinalProject.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
	
	@OneToOne(mappedBy = "trainer", optional = true)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Manage man;
}
