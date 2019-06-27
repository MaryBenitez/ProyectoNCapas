package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (schema="public",name="reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(generator="reserva_id_reserva_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="reserva_id_reserva_seq",sequenceName="public.reserva_id_reserva_seq",allocationSize = 1)
	@Column(name="id_reserva")
	private Integer idReserva;
	@Column(name="fecha")
	private String fecha;
	@Column(name="acantidad")
	private Integer aCantidad;
	@Column(name="grantotal")
	private Double granTotal;
	@Column(name="subtotal")
	private Double subTotal;
	@Column(name="tcuenta")
	private Double tCuenta;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_usuario")
	private Usuario usuario;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_funcion")
	private Funcion funcion;
	
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getaCantidad() {
		return aCantidad;
	}
	public void setaCantidad(Integer aCantidad) {
		this.aCantidad = aCantidad;
	}
	public Double getGranTotal() {
		return granTotal;
	}
	public void setGranTotal(Double granTotal) {
		this.granTotal = granTotal;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public Double gettCuenta() {
		return tCuenta;
	}
	public void settCuenta(Double tCuenta) {
		this.tCuenta = tCuenta;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Funcion getFuncion() {
		return funcion;
	}
	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	
}
