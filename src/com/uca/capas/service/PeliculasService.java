package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Pelicula;

public interface PeliculasService  {

	public List<Pelicula> findAll();

	public Pelicula save(Pelicula p);

	public Pelicula findOne(Integer id);
	
	public List<Pelicula> findByEstado(Boolean status);
}
