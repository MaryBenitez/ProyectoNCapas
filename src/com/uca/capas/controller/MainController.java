package com.uca.capas.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.service.UsuarioService;

@Controller
public class MainController {

	@Autowired
	UsuarioService uService;
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
	@RequestMapping("/dashboard")
	public String userDashboard() {
		return "dashboard_user";
	}
	@RequestMapping("/logout")
	public ModelAndView logout(@RequestParam ("idUsuario") Integer id) {
		System.out.println(id);
		ModelAndView mav = new ModelAndView();
		Usuario usuario  = uService.findOne(id);
		usuario.setIniciado(false);
		uService.save(usuario);
		mav.setViewName("redirect:/");
		return mav;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public int validate(@RequestParam(value = "user") String name,
			@RequestParam(value="pass") String pwd,
		HttpServletResponse response){
		
		Usuario usuario = uService.findUsuario(name, pwd);
		
		System.out.println(name + pwd);
		//ModelAndView mav = new ModelAndView();
			if(uService.findUsuario(name, pwd)==null) {
//				mav.setViewName("login");
//				mav.addObject("message", "Username or Password is wrong!!");
				System.out.println("ALVVVVVVVVVVVVVV");
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				return 1;
			} else {
				if(usuario.getIniciado() == true){
					response.setStatus(HttpServletResponse.SC_OK);
					return -1;
				}else if(usuario.getTipo() == true && usuario.getEstado() == true)  {
					
					usuario.setIniciado(true);
					uService.save(usuario);
					response.setStatus(HttpServletResponse.SC_OK);
					return usuario.getIdUsr();
				}else {
//					mav.setViewName("admin/peliculas/dashboard_admin");
					response.setStatus(HttpServletResponse.SC_OK);
					return 0;
				}
			}
	}
	@RequestMapping("/comment")
	public ModelAndView comentario(@RequestParam("codigoP") Integer id) {
		ModelAndView mav = new ModelAndView();
		Usuario user = uService.findOne(id);
		mav.addObject("codigo", user.getIdUsr());
		mav.setViewName("comment");
		
		return mav;
	}
	
	
//	@RequestMapping(value = "/login",method = RequestMethod.POST)
////	@ResponseBody
//	public ModelAndView main(@RequestParam(name = "user") String user, @RequestParam(name = "pass") String pass,
//			HttpServletResponse response){
//		
//		ModelAndView mav = new ModelAndView();
//		uService.findUsuario(user, pass);
//		
//		
//		if(uService.findUsuario(user, pass)==null) {
//			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
//			return 1;
//		} else {
//			response.setStatus(HttpServletResponse.SC_OK);
//			return uService.findUsuario(user, pass).getIdUsr();
//		}
//		
//	}
	
}
