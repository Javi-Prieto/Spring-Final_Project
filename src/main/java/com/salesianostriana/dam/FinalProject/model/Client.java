package com.salesianostriana.dam.FinalProject.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client implements UserDetails {
	
	@Id
	@GeneratedValue
	private Long codCliente;
	
	private String dni, codPostal, cuentaBanco, email, numTelefono, password, username; 
	private double cuotaMens = 32.99;
	private int alturaCm, peso, edad, sqWeight, bpWeigh, dlWeight, sqReps, bpReps, dlReps;
	private boolean admin = false;
	
	@OneToOne(mappedBy = "cliente", optional = true)
	private Hire hirePtrainer;
	
	@OneToOne(mappedBy = "cliente", optional = true)
	private Reserve roomReserve;
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String role = "ROLE_";
		role += (admin) ? "ADMIN" : "USER";
		return List.of(new SimpleGrantedAuthority(role));
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
