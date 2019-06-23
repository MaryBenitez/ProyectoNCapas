package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.FunxSala;

public interface FunxSalaService {

	public List<FunxSala> findAll();
	
	public FunxSala findOne(Integer id);
}
