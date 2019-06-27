package com.uca.capas.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uca.capas.service.UsuarioService;

@Controller
public class MainController {

	@Autowired
	UsuarioService uService;
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
	@RequestMapping("/user/dashboard")
	public String userDashboard() {
		return "dashboard_user";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public int main(@RequestParam(name = "user") String user, @RequestParam(name = "pass") String pass,
			HttpServletResponse response){
		
		if(uService.findUsuario(user, pass)==null) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return 1;
		} else {
			response.setStatus(HttpServletResponse.SC_OK);
			return uService.findUsuario(user, pass).getIdUsr();
		}
		
	}
}
