package com.xworkz.eventmangment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="eventinfo")
public class EventEntity {
	
	@Id
	private int id;
	private String eventName;
	private String typeOfEvent;
	private String organizarName;
	private String place;



}
