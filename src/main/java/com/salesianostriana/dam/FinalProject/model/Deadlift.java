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
public class Deadlift {
	
	@Id
	@GeneratedValue
	private Long idDl;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_dl_client"))
	private Client clienteD;
	
	private int kgs, reps;
}
