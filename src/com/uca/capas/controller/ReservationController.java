package com.uca.capas.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Formato;
import com.uca.capas.domain.Funcion;
import com.uca.capas.domain.Pelicula;
import com.uca.capas.service.FormatoService;
import com.uca.capas.service.FuncionService;
import com.uca.capas.service.PeliculasService;

@Controller
public class ReservationController {

	@Autowired
	PeliculasService peliservice;
	@Autowired
	FuncionService fService;
	@Autowired
	FormatoService forService;
	
	@RequestMapping("/cartelera")
	public ModelAndView showMovies() {
		ModelAndView mav = new ModelAndView();
		List<Pelicula> p = peliservice.findAll();
		mav.addObject("pelicula",p ); 
		mav.setViewName("reserva/Reservation");
		
		return mav;
	}
	@RequestMapping("/reserva")
	public ModelAndView reserva() {
		ModelAndView mav = new ModelAndView();
		List<Funcion> funciones = fService.findAll();
		List<Formato> formato = forService.findAll();
		mav.addObject("funciones",funciones ); 
		mav.addObject("formato",formato ); 
		mav.setViewName("reserva/reserva");
		
		return mav;
	}
}
