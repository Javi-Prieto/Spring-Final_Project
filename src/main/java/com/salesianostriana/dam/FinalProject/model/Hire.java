package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PreRemove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hire {
	@Id
	@GeneratedValue
	private Long codHire;

	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_hire_client"))
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Client cliente;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_hire_ptrainer"))
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private PersonalTrainer trainer;
	
	private LocalDate startHire;
	
	private LocalDate finishHire;
	
	public void addCliente(Client c) {
		c.setHirePtrainer(this);;
		this.cliente = c;
	}
	public void removeCliente(Client c) {
		this.cliente = null;
		c.setHirePtrainer(null);
	}
	
	public void addTrainer(PersonalTrainer t) {
		t.getClientes().add(this);
		this.trainer = t;
	}
	public void removeRoom(PersonalTrainer t) {
		this.trainer = null;
		t.getClientes().remove(this);
	}
	
	
}
