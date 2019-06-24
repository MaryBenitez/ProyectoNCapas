package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.UsuarioRepository;

@Controller
public class AdministrationUsersController {
	
	@Autowired
	UsuarioRepository userServ;
	
	@RequestMapping("/adminUsers")
	public ModelAndView adminMovies() {
		ModelAndView mav = new ModelAndView();
		List<Usuario> usuarios = userServ.findAll();
		mav.addObject("usuarios",usuarios);
		mav.setViewName("usersCat");
		return mav;
	}
	
	/*
	@RequestMapping("/addPeli")
	public ModelAndView addMovies() {
		ModelAndView mav = new ModelAndView();
		Usuario peli = new Usuario();
		mav.addObject("peli",peli);
		mav.setViewName("movieForm");
		return mav;
	}
	@RequestMapping("/savePeli")
	public ModelAndView saveMovies(@ModelAttribute ("peli") Usuario p) {
		ModelAndView mav = new ModelAndView();
		
		userServ.save(p);
		mav.setViewName("redirect:/adminMovies/");
		return mav;
	}
	
	@RequestMapping("/peliUpdate")
	public ModelAndView editPeli(@RequestParam ("codigoP") Integer id ) {
		ModelAndView mav = new ModelAndView();
		Usuario peli = new Usuario();
		peli = userServ.findById(id).get();
		mav.addObject("peli", peli);
		mav.setViewName("movieForm2");
		return mav;
	}*/
	
	
}
