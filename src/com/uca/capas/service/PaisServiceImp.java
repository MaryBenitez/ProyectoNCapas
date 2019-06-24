package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Pais;
import com.uca.capas.repositories.PaisRepository;

@Service
public class PaisServiceImp implements PaisService{
	
	@Autowired
	PaisRepository paisRep;
	
	@Override
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return paisRep.findAll();	}

	@Override
	public Pais findOne(Integer id) {
		// TODO Auto-generated method stub
		return paisRep.findById(id).get();
	}

}
