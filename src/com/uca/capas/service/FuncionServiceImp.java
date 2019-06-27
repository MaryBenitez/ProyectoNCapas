package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Formato;
import com.uca.capas.domain.Funcion;
import com.uca.capas.domain.Pelicula;
import com.uca.capas.dto.FunPelForDTO;
import com.uca.capas.repositories.FuncionRepository;

@Service
public class FuncionServiceImp implements FuncionService{

	@Autowired
	FuncionRepository funRepo;
	@Autowired
	PeliculasService pService;
	@Autowired
	FormatoService foService;
	

	@Override
	public List<Funcion> findAll() {
		// TODO Auto-generated method stub
		return funRepo.findAll();
		
	}

	@Override
	public Funcion findOne(Integer id) {
		// TODO Auto-generated method stub
		return funRepo.findById(id).get();
	}

	@Override
	public List<FunPelForDTO> findFuncByPel() {
		// TODO Auto-generated method stub
		return funRepo.fetchFuncPelForInnerJoin();
	}
	
	public Funcion save(FunPelForDTO dto) {
		Pelicula p = pService.findOne(Integer.parseInt(dto.getPelicula()));
		Formato fo =  foService.findOne(Integer.parseInt(dto.getFormato()));
		Funcion f = new Funcion();
		f.setIdFuncion(dto.getIdFuncion());
		f.setHora(dto.getHora());
		f.setFecha(dto.getFecha());
		f.setActivo(true);
		f.setPelicula(p);
		f.setFormato(fo);
		f.setCasientoe(75);

		
		return funRepo.save(f);
	}

	@Override
	public Funcion normalSave(Funcion f) {
		// TODO Auto-generated method stub
		return funRepo.save(f);
	}

	@Override
	public FunPelForDTO findOneDTO(Integer id) {
		// TODO Auto-generated method stub
		return funRepo.fetchOneFuncPelForInnerJoin(id);
	}

	@Override
	public List<Funcion> finByPelicula(Pelicula id) {
		// TODO Auto-generated method stub
		return funRepo.findByPelicula(id);
	}
	
}
