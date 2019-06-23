package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Pelicula;
import com.uca.capas.repositories.PeliculaRepository;

@Service
public class PeliculasServiceImp implements PeliculasService{

	@Autowired
	PeliculaRepository pelirepo;
	
	@Override
	public List<Pelicula> findAll() {
		// TODO Auto-generated method stub
		return pelirepo.findAll();
	}

}