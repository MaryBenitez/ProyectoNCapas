package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	UsuarioRepository usrRepo;
	@Override
	public List<Usuario> findAll() {
		return usrRepo.findAll();
		
	}

	@Override
	public Usuario findOne(Integer id) {
		return usrRepo.getOne(id);
	}

}
