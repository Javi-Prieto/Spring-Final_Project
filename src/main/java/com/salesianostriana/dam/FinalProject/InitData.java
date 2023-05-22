package com.salesianostriana.dam.FinalProject;

import java.time.LocalDate;
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
				.cuentaBanco("0")
				.numTelefono("0")
				.cuotaMens(0)
				.email("user@user.com")
				.birthDate(LocalDate.of(2004, 3, 11))
				.gender('M')
				.build();
		
		Client admin = Client.builder()
				.admin(true)
				.username("admin")
				.password(passwordEncoder.encode("admin"))
				.cuentaBanco("0")
				.numTelefono("0")
				.cuotaMens(0)
				.email("admin@admin.com")
				.birthDate(LocalDate.of(2004, 3, 11))
				.gender('F')
				.build();
		
		servicio.saveAll(List.of(admin, usuario));		
		
	}

}
