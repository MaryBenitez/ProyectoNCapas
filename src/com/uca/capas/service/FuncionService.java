package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Funcion;

public interface FuncionService {

	public List<Funcion> findAll();
	
	public Funcion findOne(Integer id);
}
