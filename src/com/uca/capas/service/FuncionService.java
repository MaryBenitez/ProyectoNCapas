package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Funcion;
import com.uca.capas.domain.Pelicula;
import com.uca.capas.dto.FunPelForDTO;

public interface FuncionService {

	public List<Funcion> findAll();
	
	public Funcion findOne(Integer id);
	
	public FunPelForDTO findOneDTO(Integer id);
	
	public List<FunPelForDTO> findFuncByPel();
	
	public Funcion save(FunPelForDTO dto);
	
	public Funcion normalSave(Funcion id);
	
	public List<Funcion> finByPelicula(Pelicula id);
}
