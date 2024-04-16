package com.xworkz.eventmangment.repository;

import com.xworkz.eventmangment.dto.EventDTO;
import com.xworkz.eventmangment.entity.EventEntity;

public interface EventRepository{
	
	public boolean saveDTO(EventDTO dto);
	default EventEntity findById(int id) {
		return null;
	}


}
