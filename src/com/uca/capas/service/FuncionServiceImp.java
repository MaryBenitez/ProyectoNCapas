package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Funcion;
import com.uca.capas.repositories.FuncionRepository;

@Service
public class FuncionServiceImp implements FuncionService{

	@Autowired
	FuncionRepository funRepo;
	@Override
	public List<Funcion> findAll() {
		// TODO Auto-generated method stub
		return funRepo.findAll();
		
	}

	@Override
	public Funcion findOne(Integer id) {
		// TODO Auto-generated method stub
		return funRepo.getOne(id);
	}

}
