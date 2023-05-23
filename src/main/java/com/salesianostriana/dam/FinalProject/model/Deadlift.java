package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

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
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	private int kgs, reps;
	
	public void addCliente(Client c) {
		c.getDeadliftList().add(this);
		this.clienteD = c;
	}
	public void removeCliente(Client c) {
		this.clienteD = null;
		c.getDeadliftList().remove(this);
	}
}
