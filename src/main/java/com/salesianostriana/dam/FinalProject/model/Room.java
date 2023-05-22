package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Room {
	@Id
	@GeneratedValue
	private Long codSala;
	
	private int limiteClientes;
	
	private LocalDateTime horaInicio, horaFin;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(
			mappedBy="room", 
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@Builder.Default
	private List<Reserve> clients = new ArrayList<>();
	
	/*@ManyToOne
	private ClassTrainer ct;*/
}
