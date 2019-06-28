package com.uca.capas.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Formato;
import com.uca.capas.domain.Funcion;
import com.uca.capas.domain.Pelicula;
import com.uca.capas.domain.Reserva;
import com.uca.capas.domain.Usuario;
import com.uca.capas.dto.ReservationDTO;
import com.uca.capas.service.FormatoService;
import com.uca.capas.service.FuncionService;
import com.uca.capas.service.PeliculasService;
import com.uca.capas.service.ReservaService;
import com.uca.capas.service.UsuarioService;

@Controller
public class ReservationController {

	@Autowired
	PeliculasService peliservice;
	@Autowired
	FuncionService fService;
	@Autowired
	FormatoService forService;
	@Autowired
	PeliculasService pService;
	@Autowired
	ReservaService rService;
	@Autowired
	UsuarioService uService;
	
	@RequestMapping("/cartelera")
	public ModelAndView showMovies() {
		ModelAndView mav = new ModelAndView();
		List<Pelicula> p = peliservice.findByEstado(true);
		mav.addObject("pelicula",p ); 
		mav.setViewName("reserva/Reservation");
		
		return mav;
	}
	@RequestMapping("/reserva")
	public ModelAndView reserva(@RequestParam ("idPeli") Integer id) {
		ModelAndView mav = new ModelAndView();
		ReservationDTO dto = new ReservationDTO();
		//List<Funcion> funciones = fService.findAll();
		List<Formato> formato = forService.findAll();
		List<Funcion> funciones = fService.finByPelicula(pService.findOne(id));
		//mav.addObject("funciones",funciones ); 
		mav.addObject("formato",formato ); 
		mav.addObject("funciones",funciones ); 
		mav.addObject("reservaDTO",dto ); 
		mav.setViewName("reserva/reserva");
		
		return mav;
	}
	@RequestMapping("/reserva2")
	public ModelAndView reserva2(@RequestParam("idFuncion") Integer id) {
		ModelAndView mav = new ModelAndView();
			ReservationDTO dto = new ReservationDTO();
			Funcion funcion = fService.findOne(id);
			mav.addObject("funcion", funcion);
			mav.addObject("reservaDTO",dto);
			mav.setViewName("reserva/reserva2");
		return mav;
	}
	
	@RequestMapping("/addReserva")
	public ModelAndView reserva(@ModelAttribute ("reservaDTO") ReservationDTO dto, @RequestParam("idUsuario") String id, @RequestParam("idFuncion") Integer idF, @RequestParam("asiento") Integer asientos, @RequestParam("saldo") Double x) {
		ModelAndView mav = new ModelAndView();
		Funcion funcion = fService.findOne(idF);
		Reserva reserva = rService.save(dto,Integer.parseInt(id),idF);
		mav.addObject("funcion",funcion);
		mav.addObject("dto", dto);
		mav.addObject("reserva", reserva);
		mav.addObject("asiento", asientos);
		mav.addObject("x", x);
		mav.setViewName("reserva/resument");
		return mav;
	}
	@RequestMapping("/historial")
	public ModelAndView historial(@RequestParam("idUsuario") Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("historial");
		Usuario u = uService.findOne(id);
		List<Reserva> reserva = rService.findByUsuario(u);
		mav.addObject("reserva", reserva);
		return mav;
		
	}
	@RequestMapping("/filtro")
	public ModelAndView filtro(@RequestParam("cu") Integer id,@RequestParam("fechaI") String fi, @RequestParam("fechaF") String ff) {
		ModelAndView mav = new ModelAndView();
		Usuario usuario = uService.findOne(id);
		List<Reserva> reserva = rService.findAll();
		mav.addObject("reserva", reserva);
		mav.setViewName("historial");
		return mav;
		
	}
	
	
	
}
