package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Departamento;
import com.uca.capas.repositories.DepartamentoRepository;

@Service
public class DepartamentoServiceImp implements DepartamentoService{

	@Autowired
	DepartamentoRepository depRepo;
	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return depRepo.findAll();
		
	}

	@Override
	public Departamento findOne(Integer id) {
		// TODO Auto-generated method stub
		return depRepo.findById(id).get();
	}

}
