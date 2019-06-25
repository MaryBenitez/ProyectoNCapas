package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Formato;
import com.uca.capas.domain.Pelicula;
import com.uca.capas.dto.FunPelForDTO;
import com.uca.capas.service.FormatoService;
import com.uca.capas.service.FuncionService;
import com.uca.capas.service.PeliculasService;

@Controller
public class AdministrationFuncionesController {

	@Autowired
	FuncionService fService;
	@Autowired
	PeliculasService pService;
	@Autowired
	FormatoService forService;
	
	@RequestMapping("/adminFunciones")
	public ModelAndView adminMovies() {
		ModelAndView mav = new ModelAndView();
		//List<Funcion> funciones = fService.findAll();
		List<FunPelForDTO> funciones = fService.findFuncByPel();
		mav.addObject("funciones",funciones);
		mav.setViewName("admin/funciones/funcionesCat");
		return mav;
	}
	
	@RequestMapping("/addFuncion")
	public ModelAndView addFuncion() {
		
		ModelAndView mav = new ModelAndView();
		List<Pelicula> pelis = pService.findAll();
		List<Formato> formato = forService.findAll();
		mav.addObject("funcionDTO", new FunPelForDTO());
		mav.addObject("pelis",pelis);
		mav.addObject("formato",formato);
		mav.setViewName("admin/funciones/funcionesForm");
		return mav;
	}
	
	@RequestMapping("/saveFuncion")
	public ModelAndView saveFuncion(@ModelAttribute ("funcionDTO") FunPelForDTO dto){
		ModelAndView mav = new ModelAndView();	
		fService.save(dto);
		mav.setViewName("redirect:adminFunciones/");
		return mav;
	}
	@RequestMapping("/funcUpdate")
	public ModelAndView editFunc(@RequestParam ("codigoP") Integer id) {
		ModelAndView mav = new ModelAndView();
		Pelicula peli = new Pelicula();
		peli = pelServ.findOne(id);
		mav.addObject("peli", peli);
		mav.setViewName("admin/peliculas/movieForm");
		return mav;
	}
	
	
	
}
