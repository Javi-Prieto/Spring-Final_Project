package com.salesianostriana.dam.FinalProject.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Squat {
	@Id
	@GeneratedValue
	private Long idSq;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_sq_client"))
	private Client clienteS;
	
	private int kgs, reps;
}
