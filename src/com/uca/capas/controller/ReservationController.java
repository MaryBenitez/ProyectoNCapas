package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.service.PeliculasService;

@Controller
public class ReservationController {

	@Autowired
	PeliculasService peliservice;
	
	@RequestMapping("/cartelera")
	public ModelAndView showMovies() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pelicula", peliservice.findAll());
		mav.setViewName("Reservation");
		return mav;
	}
}
