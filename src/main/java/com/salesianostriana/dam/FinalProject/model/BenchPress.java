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
public class BenchPress {
	@Id
	@GeneratedValue
	private Long idBp;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_bp_client"))
	private Client clienteB;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	private int kgs, reps;
	
	public void addCliente(Client c) {
		c.getBenchpressList().add(this);
		this.clienteB = c;
	}
	public void removeCliente(Client c) {
		this.clienteB = null;
		c.getBenchpressList().remove(this);
	}
}
