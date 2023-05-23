package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_res_client"))
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Client cliente;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_res_room"))
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Room room;
	
	public void addCliente(Client c) {
		c.getReservas().add(this);
		this.cliente = c;
	}
	public void removeCliente(Client c) {
		this.cliente = null;
		c.getReservas().remove(this);
	}
	
	public void addRoom(Room r) {
		r.getClients().add(this);
		this.room = r;
	}
	public void removeRoom(Room r) {
		this.room = null;
		r.getClients().remove(this);
	}
	
	
}
