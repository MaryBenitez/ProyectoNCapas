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
	
	@Override
	public Pelicula save(Pelicula p) {
		// TODO Auto-generated method stub
		return pelirepo.save(p);
	}

	@Override
	public Pelicula findOne(Integer id) {
		// TODO Auto-generated method stub
		return pelirepo.findById(id).get();
	}

}
