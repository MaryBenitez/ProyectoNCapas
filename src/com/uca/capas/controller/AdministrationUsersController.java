package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Departamento;
import com.uca.capas.domain.Municipio;
import com.uca.capas.domain.Pais;
import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.DepartamentoRepository;
import com.uca.capas.repositories.MunicipioRepository;
import com.uca.capas.repositories.PaisRepository;
import com.uca.capas.repositories.UsuarioRepository;
import com.uca.capas.service.DepartamentoService;
import com.uca.capas.service.MunicipioService;
import com.uca.capas.service.PaisService;

@Controller
public class AdministrationUsersController {
	
	@Autowired
	UsuarioRepository userServ;
	@Autowired
	PaisService paisServ;
	@Autowired
	MunicipioService muniServ;
	@Autowired
	DepartamentoService depServ;
	
	@RequestMapping("/adminUsers")
	public ModelAndView adminMovies() {
		ModelAndView mav = new ModelAndView();
		List<Usuario> usuarios = userServ.findAll();
		mav.addObject("usuarios",usuarios);
		mav.setViewName("admin/usersCat");
		return mav;
	}
	
	
	@RequestMapping("/addUser")
	public ModelAndView addMovies() {
		ModelAndView mav = new ModelAndView();
		Usuario usr = new Usuario();
		List<Pais> pais = paisServ.findAll();
		List<Municipio> muni = muniServ.findAll();
		List<Departamento> dep = depServ.findAll();
		mav.addObject("paises",pais);
		mav.addObject("munis", muni);
		mav.addObject("deps", dep);
		mav.addObject("usuario",usr);
		mav.setViewName("admin/userForm");
		return mav;
	}
	
	@RequestMapping("/saveUser")
	public ModelAndView saveMovies(@ModelAttribute ("usuario") Usuario p, 
			@RequestParam("select") Integer idp, 
			@RequestParam("select2") Integer idd, 
			@RequestParam("select3") Integer idm) {
		ModelAndView mav = new ModelAndView();
		Pais pais = paisServ.findOne(idp);
		Departamento dept = depServ.findOne(idd);
		Municipio muni = muniServ.findOne(idm);
		p.setPais(pais);
		p.setMunicipio(muni);
		p.setDepartamento(dept);
		if(p.getIdUsr()== null) {
			p.setSaldo(20.00);
			p.setIniciado(false);
		}
		
		userServ.save(p);
		mav.setViewName("redirect:adminUsers/");
		return mav;
	}
	
}
