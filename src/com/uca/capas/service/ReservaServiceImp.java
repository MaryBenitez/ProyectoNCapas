package com.uca.capas.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Funcion;
import com.uca.capas.domain.Reserva;
import com.uca.capas.domain.Usuario;
import com.uca.capas.dto.ReservationDTO;
import com.uca.capas.repositories.ReservaRepository;

@Service
public class ReservaServiceImp implements ReservaService{
	
	@Autowired
	ReservaRepository resRep;
	@Autowired
	UsuarioService uService;
	@Autowired
	FuncionService fService;
	
	@Override
	public List<Reserva> findAll() {
		return resRep.findAll();	}

	@Override
	public Reserva findOne(Integer id) {
		return resRep.getOne(id);
	}

	@Override
	public Reserva save(ReservationDTO r, Integer id, Integer idF) {
		// TODO Auto-generated method stub
		Usuario u = uService.findOne(id);
		Reserva re = new Reserva();
		Funcion f =  fService.findOne(idF);
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes =Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String fecha = annio.concat("-"+mes+"-"+dia);
		re.setFecha(fecha);
		re.setaCantidad(r.getAsiento());
		re.setSubTotal(5.0);
		if(r.getSaldo() == null) {
			r.setSaldo(0.0);
		}
		re.setGranTotal((re .getSubTotal() * r.getAsiento())- r.getSaldo());
		System.out.println("SALDOOOO" + u.getSaldo());
		u.setSaldo( u.getSaldo() - r.getSaldo());
		re.settCuenta(u.getSaldo());
		uService.save(u);
		System.out.println("SALDOOOO" + u.getSaldo());
		re.setUsuario(u);
		f.setCasientoe(f.getCasientoe() - r.getAsiento());
		re.setFuncion(f);
		fService.normalSave(f);
		return resRep.save(re);
	}

	@Override
	public List<Reserva> filtrar(Integer id, String fi, String ff) {
		// TODO Auto-generated method stub
		return resRep.filtrar(id, fi, ff);
	}

	@Override
	public List<Reserva> findByUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return resRep.findByUsuario(u);
	}

}
