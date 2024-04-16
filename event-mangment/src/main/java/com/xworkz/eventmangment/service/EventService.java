package com.xworkz.eventmangment.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.eventmangment.dto.EventDTO;

public interface EventService {
	
	Set<ConstraintViolation<EventDTO>> validateAndSave(EventDTO dto);
	default EventDTO findById(int id) {
		return null;
	}

}
