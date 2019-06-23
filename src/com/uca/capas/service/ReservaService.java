package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Reserva;

public interface ReservaService {

		public List<Reserva> findAll();
		
		public Reserva findOne(Integer id);
}
