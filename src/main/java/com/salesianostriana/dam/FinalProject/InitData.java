package com.salesianostriana.dam.FinalProject;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.repositories.ClientRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {
	
	private final PasswordEncoder passwordEncoder;
	private final ClientRepository servicio;
	
	@PostConstruct
	public void init() {
		
		Client usuario = Client.builder()
				.admin(false)
				.username("user")
				.password(passwordEncoder.encode("1234"))
				.bpReps(0)
				.bpWeigh(0)
				.sqReps(0)
				.sqWeight(0)
				.dlReps(0)
				.dlWeight(0)
				.cuentaBanco("0")
				.numTelefono("0")
				.cuotaMens(0)
				.email("user@user.com")
				.build();
		
		Client admin = Client.builder()
				.admin(true)
				.username("admin")
				.password(passwordEncoder.encode("admin"))
				.bpReps(0)
				.bpWeigh(0)
				.sqReps(0)
				.sqWeight(0)
				.dlReps(0)
				.dlWeight(0)
				.cuentaBanco("0")
				.numTelefono("0")
				.cuotaMens(0)
				.email("admin@admin.com")
				.build();
		
		servicio.saveAll(List.of(admin, usuario));		
		
	}

}
