package com.salesianostriana.dam.FinalProject.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.DayOfTheWeek;
import com.salesianostriana.dam.FinalProject.model.MuscleGroup;
import com.salesianostriana.dam.FinalProject.model.Planning;
import com.salesianostriana.dam.FinalProject.model.Routine;

@Service
public class PlanningService {
	
	private Routine rt;
	private Planning plan;
	
	public PlanningService() {
		exercisesPerMuscle();
		weekDistribution();
	}
	public void exercisesPerMuscle() {
		Map<MuscleGroup, List<String>> listNew = new HashMap<>();
		listNew.put(MuscleGroup.CHEST, 
				List.of("Press Banca", "Press Banca Inclinado", "Press Banca Declinado", "Aperturas en polea alta", "Aperturas Inclinadas"));
		listNew.put(MuscleGroup.BACK, 
				List.of("Remo Libre con Barra", "Remo unilateral con mancuerna", "Remo en máquina", "Jalón al pecho", "Pull Over", "Jalón unilateral"));
		listNew.put(MuscleGroup.SHOULDER, 
				List.of("Press Militar con mancuerna", "Elevaciones Laterales", "Elevaciones Frontales", "FacePull"));
		listNew.put(MuscleGroup.LEGS, 
				List.of("Sentadilla libre", "Extensión de cuadriceps", "Sentadilla con cinturón", "Prensa", "Elevaciones de gemelo", "Curl Femoral tumbado", "Peso Muerto Rumano"));
		listNew.put(MuscleGroup.TRICEPS, 
				List.of("Press banca Cerrado (smith)", "Extensión de triceps con cuerda", "Fondos en paralelas", "Extensión de triceps trasnuca", "Patade de triceps en polea unilateral"));
		listNew.put(MuscleGroup.BICEPS, 
				List.of("Curl de biceps con barra Z", "Curl predicador con mancuerna", "Spider curl", "Curl de martillo en polea", "Curl en máquina"));
		
		
		rt.setMuscleExecersises(listNew);
	}
	public void weekDistribution() {
		Random rnd = new Random();
		int ran = rnd.nextInt(3);
		Map<DayOfTheWeek, List<List<String>>> newPlan = new HashMap<>();
		switch(ran) {
			case 0:
				newPlan.put(DayOfTheWeek.LUNES, List.of(rt.getMuscleExecersises().get(MuscleGroup.CHEST)));
				newPlan.put(DayOfTheWeek.MARTES, List.of(rt.getMuscleExecersises().get(MuscleGroup.BACK)));
				newPlan.put(DayOfTheWeek.MIERCOLES, List.of(rt.getMuscleExecersises().get(MuscleGroup.LEGS)));
				newPlan.put(DayOfTheWeek.JUEVES, List.of(rt.getMuscleExecersises().get(MuscleGroup.SHOULDER)));
				newPlan.put(DayOfTheWeek.VIERNES, List.of(List.of("Rest")));
				newPlan.put(DayOfTheWeek.SABADO, List.of(rt.getMuscleExecersises().get(MuscleGroup.LEGS)));
				newPlan.put(DayOfTheWeek.DOMINGO, List.of(rt.getMuscleExecersises().get(MuscleGroup.BICEPS)
						, rt.getMuscleExecersises().get(MuscleGroup.TRICEPS)));
				break;
			case 1:
				newPlan.put(DayOfTheWeek.LUNES, List.of(rt.getMuscleExecersises().get(MuscleGroup.CHEST)
						, rt.getMuscleExecersises().get(MuscleGroup.TRICEPS)));
				newPlan.put(DayOfTheWeek.MARTES, List.of(rt.getMuscleExecersises().get(MuscleGroup.BACK)
						, rt.getMuscleExecersises().get(MuscleGroup.BICEPS )));
				newPlan.put(DayOfTheWeek.MIERCOLES, List.of(rt.getMuscleExecersises().get(MuscleGroup.LEGS)));
				newPlan.put(DayOfTheWeek.JUEVES, List.of(rt.getMuscleExecersises().get(MuscleGroup.SHOULDER)));
				newPlan.put(DayOfTheWeek.VIERNES, List.of(List.of("Rest")));
				newPlan.put(DayOfTheWeek.SABADO, List.of(rt.getMuscleExecersises().get(MuscleGroup.BACK)
						, rt.getMuscleExecersises().get(MuscleGroup.CHEST)));
				newPlan.put(DayOfTheWeek.DOMINGO, List.of(rt.getMuscleExecersises().get(MuscleGroup.LEGS)));
						
				break;
			case 2:

				newPlan.put(DayOfTheWeek.LUNES, List.of(rt.getMuscleExecersises().get(MuscleGroup.CHEST)
						, rt.getMuscleExecersises().get(MuscleGroup.TRICEPS)
						, rt.getMuscleExecersises().get(MuscleGroup.SHOULDER)));
				newPlan.put(DayOfTheWeek.MARTES, List.of(rt.getMuscleExecersises().get(MuscleGroup.BACK)
						, rt.getMuscleExecersises().get(MuscleGroup.BICEPS )));
				newPlan.put(DayOfTheWeek.MIERCOLES, List.of(rt.getMuscleExecersises().get(MuscleGroup.LEGS)));
				newPlan.put(DayOfTheWeek.JUEVES, List.of(List.of("Rest")));
				newPlan.put(DayOfTheWeek.VIERNES, List.of(rt.getMuscleExecersises().get(MuscleGroup.BACK)
						, rt.getMuscleExecersises().get(MuscleGroup.CHEST)));
				newPlan.put(DayOfTheWeek.SABADO, List.of(rt.getMuscleExecersises().get(MuscleGroup.LEGS)));
				newPlan.put(DayOfTheWeek.DOMINGO, List.of(List.of("Rest")));
				break;
			default:
				
		}
		plan.setPlan(newPlan);
	}
	
		
		
}
