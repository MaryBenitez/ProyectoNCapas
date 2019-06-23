package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Reserva;
import com.uca.capas.repositories.ReservaRepository;

@Service
public class ReservaServiceImp implements ReservaService{
	
	@Autowired
	ReservaRepository resRep;
	
	@Override
	public List<Reserva> findAll() {
		return resRep.findAll();	}

	@Override
	public Reserva findOne(Integer id) {
		return resRep.getOne(id);
	}

}
