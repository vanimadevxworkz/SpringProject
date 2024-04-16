package com.xworkz.eventmangment.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.eventmangment.dto.EventDTO;
import com.xworkz.eventmangment.service.EventService;

@Controller
@RequestMapping()
public class EventContoller {

	
	@Autowired
	EventService eventService;

	public EventContoller() {
		System.out.println("EventController");
	}

	List<String> place = Arrays.asList("Bangalore", "Mysore", "vijayanagar");

	@GetMapping("/save")
	public String onSave(Model model) {
		model.addAttribute("place", place);
		return "Events";

	}

	@PostMapping("/save")
	public String onSave(EventDTO dto,Model model) {
		System.out.println("events details"+dto);
		Set<ConstraintViolation<EventDTO>> violation = this.eventService.validateAndSave(dto);
		if(!violation.isEmpty()) {
			model.addAttribute("place", place);
			return "Events";
		}
		model.addAttribute("place",place);
		model.addAttribute("errors",violation);
		return "Events";
		
	}
	
	@GetMapping("/Search")
	public String getSearch(Model model, @RequestParam int id) {

		EventDTO edto = this.eventService.findById(id);
		if (edto != null) {
			model.addAttribute("dto", edto);
		} else {
			model.addAttribute("error", "data Not found");
		}
		return "SearchEvents";
	}
}
