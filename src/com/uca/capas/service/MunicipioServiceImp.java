package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Municipio;
import com.uca.capas.repositories.MunicipioRepository;

@Service
public class MunicipioServiceImp implements MunicipioService{

	@Autowired
	MunicipioRepository munRepo;
	@Override
	public List<Municipio> findAll() {
		// TODO Auto-generated method stub
		return munRepo.findAll();
		
	}

	@Override
	public Municipio findOne(Integer id) {
		// TODO Auto-generated method stub
		return munRepo.findById(id).get();
	}

}
