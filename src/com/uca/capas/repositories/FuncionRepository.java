package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Funcion;
import com.uca.capas.domain.Pelicula;
import com.uca.capas.dto.FunPelForDTO;

@Repository
public interface FuncionRepository extends JpaRepository<Funcion, Integer>{

	@Query("SELECT new com.uca.capas.dto.FunPelForDTO(f.idFuncion, f.hora, f.fecha, pe.nombre, fo.formato, f.activo) "
			+ "FROM com.uca.capas.domain.Funcion f INNER JOIN f.pelicula pe INNER JOIN f.formato fo" )
	public List<FunPelForDTO> fetchFuncPelForInnerJoin();
	
	@Query("SELECT new com.uca.capas.dto.FunPelForDTO(f.idFuncion, f.hora, f.fecha, pe.nombre, fo.formato, f.activo) "
			+ "FROM com.uca.capas.domain.Funcion f INNER JOIN f.pelicula pe INNER JOIN f.formato fo where f.idFuncion = ?1" )
	public FunPelForDTO fetchOneFuncPelForInnerJoin(Integer id);
	
//	@Query("select * from funcion where fk_pelicula  = ?1")
	public List<Funcion> findByPelicula(Pelicula id);
}

