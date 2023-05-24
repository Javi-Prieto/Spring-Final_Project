package com.salesianostriana.dam.FinalProject.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class Manage {
	@Id
	@GeneratedValue
	private Long idMan;
	
	private LocalDateTime horaInicio, horaSalida;
	
	@OneToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_man_trainer"))
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private ClassTrainer trainer;
	
	@OneToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_man_room"))
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Room room;
	
	public void addTrainer(ClassTrainer t) {
		t.setMan(this);
		this.trainer = t;
	}
	public void removeTrainer(ClassTrainer t) {
		this.trainer = null;
		t.setMan(null);
	}
	
	public void addRoom(Room r) {
		r.setMan(this);
		this.room = r;
	}
	public void removeRoom(Room r) {
		this.room = null;
		r.setMan(null);
	}
}
