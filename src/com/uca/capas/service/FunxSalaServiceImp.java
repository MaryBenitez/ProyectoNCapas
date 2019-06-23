package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uca.capas.domain.FunxSala;
import com.uca.capas.repositories.FunxSalaRepository;

@Service
public class FunxSalaServiceImp implements FunxSalaService{

	@Autowired
	FunxSalaRepository funxSalRepo;
	@Override
	public List<FunxSala> findAll() {
		// TODO Auto-generated method stub
		return funxSalRepo.findAll();
		
	}

	@Override
	public FunxSala findOne(Integer id) {
		// TODO Auto-generated method stub
		return funxSalRepo.getOne(id);
	}

}
