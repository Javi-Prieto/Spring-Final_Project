package com.salesianostriana.dam.FinalProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.FinalProject.model.BenchPress;
import com.salesianostriana.dam.FinalProject.model.Client;
import com.salesianostriana.dam.FinalProject.model.Deadlift;
import com.salesianostriana.dam.FinalProject.model.Squat;
import com.salesianostriana.dam.FinalProject.service.BPService;
import com.salesianostriana.dam.FinalProject.service.DLService;
import com.salesianostriana.dam.FinalProject.service.SQService;

@Controller
public class ExerciseController {
	@Autowired
	private BPService bService;
	@Autowired
	private SQService sService;
	@Autowired
	private DLService dService;
	
	@GetMapping("/mypage/exercise")
	public String showExercise(Model m) {
		m.addAttribute("benchList", bService.findAll());
		m.addAttribute("bServ", bService);
		m.addAttribute("squatList", sService.findAll());
		m.addAttribute("sServ", sService);
		m.addAttribute("dlList", dService.findAll());
		m.addAttribute("dServ", dService);
		return "exercises";
	}
	//BENCH
	@GetMapping("/mypage/exercise/bench/add")
	public String showAddBench(@AuthenticationPrincipal Client client,Model m) {
		BenchPress benchForm = new BenchPress();
		benchForm.setClienteB(client);
		m.addAttribute("benchForm", benchForm);
		return "BenchForm";
	}
	
	@PostMapping("/mypage/exercise/bench/add/submit")
	public String submitAddExercise( @ModelAttribute("benchForm") BenchPress b) {
		bService.save(b);
		return "redirect:/mypage/exercise";
	}
	
	@GetMapping("/mypage/exercise/bench/edit/{idBp}")
	public String showBenchEdit(@PathVariable("idBp") Long idBp, Model m) {
		Optional<BenchPress> forEdit = bService.findById(idBp);
		if(forEdit.isPresent()) {
			m.addAttribute("benchForm", forEdit.get());
			return "BenchForm";
		}else {
			return "redirect:/mypage/exercise";
		}
	}
	
	@PostMapping("/mypage/exercise/bench/edit/submit")
	public String submitBenchEdit(@ModelAttribute("benchForm")BenchPress b) {
		bService.edit(b);
		return "redirect:/mypage/exercise";
	}
	
	@GetMapping("/mypage/exercise/bench/delete/{idBp}")
	public String deleteBench(@PathVariable("idBp") long id) {
		bService.deleteById(id);
		return "redirect:/mypage/exercise";
	}
	//SQUAT
	@GetMapping("/mypage/exercise/squat/add")
	public String showAddSquat(@AuthenticationPrincipal Client client,Model m) {
		Squat squatForm = new Squat();
		squatForm.setClienteS(client);
		m.addAttribute("squatForm", squatForm);
		return "squatForm";
	}
	
	@PostMapping("/mypage/exercise/squat/add/submit")
	public String submitAddSquat(@ModelAttribute("squatForm") Squat s) {
		sService.save(s);
		return "redirect:/mypage/exercise";
	}
	
	@GetMapping("/mypage/exercise/squat/edit/{idSq}")
	public String showSquatEdit(@PathVariable("idSq") Long idSq, Model m) {
		Optional<Squat> forEdit = sService.findById(idSq);
		if(forEdit.isPresent()) {
			m.addAttribute("squatForm", forEdit.get());
			return "squatForm";
		}else {
			return "redirect:/mypage/exercise";
		}
	}
	
	@PostMapping("/mypage/exercise/squat/edit/submit")
	public String submitSquatEdit(@ModelAttribute("squatForm")Squat s) {
		sService.edit(s);
		return "redirect:/mypage/exercise";
	}
	
	@GetMapping("/mypage/exercise/squat/delete/{idSq}")
	public String deleteSquat(@PathVariable("idSq") long id) {
		sService.deleteById(id);
		return "redirect:/mypage/exercise";
	}
	
	
	//DEADLIFT
	
	@GetMapping("/mypage/exercise/deadlift/add")
	public String showAddDeadlift(@AuthenticationPrincipal Client client,Model m) {
		Deadlift dlForm = new Deadlift();
		dlForm.setClienteD(client);
		m.addAttribute("dlForm", dlForm);
		return "dlForm";
	}
	
	@PostMapping("/mypage/exercise/deadlift/add/submit")
	public String submitAddDeadlift(@ModelAttribute("dlForm") Deadlift d) {
		dService.save(d);
		return "redirect:/mypage/exercise";
	}
	
	@GetMapping("/mypage/exercise/deadlift/edit/{idDl}")
	public String showDeadliftEdit(@PathVariable("idDl") Long idDl, Model m) {
		Optional<Deadlift> forEdit = dService.findById(idDl);
		if(forEdit.isPresent()) {
			m.addAttribute("dlForm", forEdit.get());
			return "dlForm";
		}else {
			return "redirect:/mypage/exercise";
		}
	}
	
	@PostMapping("/mypage/exercise/deadlift/edit/submit")
	public String submitDeadliftEdit(@ModelAttribute("dlForm")Deadlift d) {
		dService.edit(d);
		return "redirect:/mypage/exercise";
	}
	
	@GetMapping("/mypage/exercise/deadlift/delete/{idDl}")
	public String deleteDeadlift(@PathVariable("idDl") long id) {
		dService.deleteById(id);
		return "redirect:/mypage/exercise";
	}
}
