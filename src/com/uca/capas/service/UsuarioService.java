package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();
	
	public Usuario findOne(Integer id);

	public Usuario save(Usuario p);
	
	public Usuario findUsuario(String user, String pass);
}
