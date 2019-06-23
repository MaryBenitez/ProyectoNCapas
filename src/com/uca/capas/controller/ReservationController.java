package com.uca.capas.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Pelicula;
import com.uca.capas.service.PeliculasService;

@Controller
public class ReservationController {

	@Autowired
	PeliculasService peliservice;
	
	
	@RequestMapping("/cartelera")
	public ModelAndView showMovies() {
		ModelAndView mav = new ModelAndView();
		List<Pelicula> p = peliservice.findAll();
		mav.addObject("pelicula",p ); 
		mav.setViewName("Reservation");
		
		return mav;
	}
}
