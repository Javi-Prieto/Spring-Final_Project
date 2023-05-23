package com.salesianostriana.dam.FinalProject.controller;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.model.PersonalTrainer;
import com.salesianostriana.dam.FinalProject.service.ClientService;
import com.salesianostriana.dam.FinalProject.service.ReserveService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ClientController {
	@Autowired
	private ClientService servicio;
	@Autowired
	private ReserveService serviceR;
	private final PasswordEncoder passwordEncoder;
	
	@GetMapping("/register")
	public String showRegisterForm(Model m) {
		Client newCliente = new Client();
		m.addAttribute("cliente", newCliente);
		return "registerForm";
	}
	
	@PostMapping("/register/submit")
	public String submitRegisterForm(@ModelAttribute("cliente") Client cliente) {
		cliente.setPassword(passwordEncoder.encode(cliente.getPassword()));
		cliente.setCancelDate(LocalDate.now().plusMonths(1));
		servicio.save(cliente);
		return "redirect:/";
	}
	
	@GetMapping("/mypage")
	public String showMyPage() {
		return "User";
	}
	
	@GetMapping("/mypage/hirereserve")
	public String showMyHiresReserves(Model model, @AuthenticationPrincipal Client client) {
		
		if(client.getHirePtrainer() != null && client.getReservas() != null) {
			model.addAttribute("trainer", client.getHirePtrainer().getTrainer());
			model.addAttribute("hire", client.getHirePtrainer());
			model.addAttribute("reserve", client.getReservas());
			return "HireReserve";
		}else if(client.getHirePtrainer() != null && client.getReservas() == null) {

			model.addAttribute("trainer", client.getHirePtrainer().getTrainer());
			model.addAttribute("hire", client.getHirePtrainer());
			return "HireReserve";
		}else if(client.getReservas() != null && client.getHirePtrainer() == null) {

			model.addAttribute("reserve", client.getReservas());
			return "HireReserve";
		}
		else {
			model.addAttribute("reserve", null);
			model.addAttribute("hire", null);
			model.addAttribute("trainer", null);
			return "HireReserve";
		}
		
		
	}
	
	@GetMapping("/admin/clientes")
	public String showAdCli(Model m) {
		m.addAttribute("clientList", servicio.findAll());
		return "ClienteAdmin";
	}
	
	@GetMapping("/reserve/delete/{idRes}")
	public String deleteReserve(@PathVariable("idRes")long idRes, @AuthenticationPrincipal Client cliente) {
		if(serviceR.findById(idRes).isPresent()){
			serviceR.deleteById(idRes);
			return "redirect:/mypage/hirereserve";
		}else {
			return "redirect:/mypage/hirereserve";
		}
	}
	
	@GetMapping("/getPlaniPDF")
	public String showPlani() throws Exception {
		servicio.createPDF();
		return "redirect:/mypage/hirereserve";
	}
	
	@GetMapping("/admin/clientes/renovar/{codCliente}")
	public String renewCancelDate(@PathVariable long codCliente) {
		Optional <Client> editC = servicio.findById(codCliente);
		if(editC.isPresent()) {
			Client edit = editC.get();
			edit.setCancelDate(
					edit
					.getCancelDate()
					.plusMonths(1)
					);
			servicio.edit(edit);
			return "redirect:/admin/clientes";
		}else {
			return "ClienteAdmin";
		}
	}
	
	@GetMapping("/admin/clientes/add")
	public String showFormAdd(Model m) {
		Client client = new Client();
		m.addAttribute("cliente", client);
		return "clientAdForm";
	}
	@PostMapping("/admin/clientes/add/submit")
	public String submitAddForm(@ModelAttribute("cliente") Client cliente) {
		servicio.save(cliente);
		return "redirect:/admin/clientes";
	}
	
	@GetMapping("/admin/clientes/edit/{codCliente}")
	public String showEditForm(@PathVariable("codCliente") Long codCliente, Model m) {
		Optional<Client> forEdit = servicio.findById(codCliente);
		
		if(forEdit.isPresent()) {
			m.addAttribute("cliente", forEdit.get());
			return "clientAdForm";
		}else {
			return "redirect:/admin/clientes";
		}
	}
	@PostMapping("/admin/clientes/edit/submit")
	public String submitEditForm(@ModelAttribute("cliente") Client a) {
		servicio.edit(a);
		return "redirect:/admin/clientes";
	}
	
	@GetMapping("/admin/clientes/delete/{codCliente}")
	public String deletePTrainer(@PathVariable("codCliente") long id) {
		servicio.deleteById(id);
		return "redirect:/admin/clientes";
	}
	
}
