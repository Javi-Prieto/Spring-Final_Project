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
public class Planning {
	
	private Map<DayOfTheWeek, List<List<String>>> plan;
	
	
	
	
}
