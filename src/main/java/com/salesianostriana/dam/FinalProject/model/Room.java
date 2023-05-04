package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Room {
	@Id
	@GeneratedValue
	private Long codSala;
	
	private int limiteClientes;
	
	private LocalDateTime hora_entrada, hora_salida;
	
	@ManyToOne
	private ClassTrainer ct;
}
