
package com.xworkz.springs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springs.dto.AeroplaneDTO;
import com.xworkz.springs.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceImp implements AeroplaneService {
	@Autowired
	AeroplaneRepository aeroplaneServiceImp;
	
	public AeroplaneServiceImp() {
		System.out.println("this is AeroplaneServiceImp");
	}
	@Override
	public boolean validateAndSave(AeroplaneDTO dto) {
		return false;
	}

}
