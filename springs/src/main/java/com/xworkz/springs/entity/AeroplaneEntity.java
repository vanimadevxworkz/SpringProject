package com.xworkz.springs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="crop_table")

public class AeroplaneEntity {

	@Id
	private int id;
	private String name;
	private String place;
}
