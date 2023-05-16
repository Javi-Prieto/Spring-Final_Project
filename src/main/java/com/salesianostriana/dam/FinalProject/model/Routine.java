package com.salesianostriana.dam.FinalProject.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Routine {
	private Map<MuscleGroup, List<String>> muscleExecersises;
}
