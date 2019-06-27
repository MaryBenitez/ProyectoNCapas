package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.uca.capas.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query(nativeQuery = true, value = "select * from public.usuario where usuario = ?1 and pass = ?2 and estado = true")
	public Usuario findUser(String user, String pass);
	

}
