package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Pelicula;
import com.uca.capas.service.PeliculasService;

@Controller
public class AdministrationController {
	
	@Autowired
	PeliculasService pelServ;
	
	@RequestMapping("/admin/dashboard")
	public String adminDashboard() {
		return "dashboard_admin";
	}
	
	@RequestMapping("/adminMovies")
	public ModelAndView adminMovies() {
		ModelAndView mav = new ModelAndView();
		List<Pelicula> pelis = pelServ.findAll();
		mav.addObject("pelis",pelis);
		mav.setViewName("moviesCat");
		return mav;
	}
	@RequestMapping("/addPeli")
	public ModelAndView addMovies() {
		ModelAndView mav = new ModelAndView();
		Pelicula peli = new Pelicula();
		mav.addObject("peli",peli);
		mav.setViewName("movieForm");
		return mav;
	}
	@RequestMapping("/savePeli")
	public ModelAndView saveMovies(@ModelAttribute ("peli") Pelicula p, @RequestParam("xd") String ruta ) {
		ModelAndView mav = new ModelAndView();
		String[] base = ruta.split(",");
		System.out.println(base[1]);
		p.setImg(base[1].getBytes());
		pelServ.save(p);
		mav.setViewName("redirect:/adminMovies/");
		return mav;
	}
	@RequestMapping("/savePeli2")
	public ModelAndView saveMovies2(@ModelAttribute ("peli") Pelicula p) {
		ModelAndView mav = new ModelAndView();
		pelServ.save(p);
		mav.setViewName("redirect:/adminMovies/");
		return mav;
	}
	
	@RequestMapping("/peliStatus")
	public ModelAndView editEstado(@RequestParam ("codigoP") Integer id ) {
		ModelAndView mav = new ModelAndView();
		Pelicula peli = new Pelicula();
		peli = pelServ.findOne(id);
		peli.setEstado(!peli.getEstado());
		pelServ.save(peli);
		mav.addObject("peli", peli);
		mav.setViewName("redirect:/adminMovies/");
		return mav;
	}
	@RequestMapping("/peliUpdate")
	public ModelAndView editPeli(@RequestParam ("codigoP") Integer id ) {
		ModelAndView mav = new ModelAndView();
		Pelicula peli = new Pelicula();
		peli = pelServ.findOne(id);
		peli.setImg(pelServ.findOne(id).getImg());
		mav.addObject("peli", peli);
		mav.setViewName("movieForm2");
		return mav;
	}
	
	
}
