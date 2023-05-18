package com.salesianostriana.dam.FinalProject.model;

import javax.persistence.Entity;
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
public class BenchPress {
	@Id
	@GeneratedValue
	private Long id_bp;
	
	@Id
	@OneToMany
	private Client cliente;
	
	private int kgs, reps;
}
