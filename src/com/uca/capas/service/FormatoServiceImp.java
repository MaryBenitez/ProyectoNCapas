package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Formato;
import com.uca.capas.repositories.FormatoRepository;

@Service
public class FormatoServiceImp implements FormatoService{
	
	@Autowired
	FormatoRepository formRep;
	
	@Override
	public List<Formato> findAll() {
		// TODO Auto-generated method stub
		return formRep.findAll();	}

	@Override
	public Formato findOne(Integer id) {
		// TODO Auto-generated method stub
		return formRep.getOne(id);
	}

}
