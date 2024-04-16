package com.xworkz.springs.repository;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.springs.dto.AeroplaneDTO;

@Repository
public class AeroplaneRepositoryImp implements AeroplaneRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public AeroplaneRepositoryImp() {
		System.out.println("this is AeroplaneRepositoryImp");
	}
	

	@Override
	public boolean saveDTO(AeroplaneDTO dto) {
		
		return false;
	}

}