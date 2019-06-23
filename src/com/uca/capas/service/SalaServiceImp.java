package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sala;
import com.uca.capas.repositories.SalaRepository;

@Service
public class SalaServiceImp implements SalaService{

	@Autowired
	SalaRepository salaRepo;
	@Override
	public List<Sala> findAll() {
		return salaRepo.findAll();
		
	}

	@Override
	public Sala findOne(Integer id) {
		return salaRepo.getOne(id);
	}

}
