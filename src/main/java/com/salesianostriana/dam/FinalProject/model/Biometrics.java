package com.salesianostriana.dam.FinalProject.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Biometrics {

	@Id
	@GeneratedValue
	private Long idBio;
	
	@ManyToOne
	private Client clienteF;
	
	private int heightCm, bw;
}
