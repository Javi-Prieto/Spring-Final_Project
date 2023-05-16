package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hire {
	@Id
	@GeneratedValue
	private Long codHire;

	@OneToOne
	private Client cliente;
	
	@ManyToOne
	private PersonalTrainer trainer;
	
	private LocalDate startHire;
	
	private LocalDate finishHire;
	
	@OneToOne
	private Planning plan;
	
	
	
}
