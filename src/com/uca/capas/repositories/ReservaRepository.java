package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Funcion;
import com.uca.capas.domain.Reserva;
import com.uca.capas.domain.Usuario;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

	@Query(value="SELECT * FROM reserva r where fk_usuario = ?1 and  CAST(fecha AS DATE) between CAST(?2 AS DATE) and CAST(?3 AS DATE)", nativeQuery=true)
	public List<Reserva> filtrar(Integer id, String fi, String ff);
	
	public List<Reserva> findByUsuario(Usuario u);
}
