package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reserve {
	
	@Id
	@GeneratedValue
	private Long idRes;
	
	private LocalDateTime horaEntrada, horaSalida;
	
	@OneToOne
	private Client cliente;
	
	@ManyToOne
	private Room room;
}
