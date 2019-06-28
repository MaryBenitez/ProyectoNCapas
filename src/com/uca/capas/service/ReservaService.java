package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Reserva;
import com.uca.capas.domain.Usuario;
import com.uca.capas.dto.ReservationDTO;

public interface ReservaService {

		public List<Reserva> findAll();
		
		public Reserva findOne(Integer id);
		
		public Reserva save (ReservationDTO r, Integer id,  Integer idF);
		
		public List<Reserva> filtrar(Integer id, String fi, String ff);
		
		public List<Reserva> findByUsuario(Usuario u);
}
