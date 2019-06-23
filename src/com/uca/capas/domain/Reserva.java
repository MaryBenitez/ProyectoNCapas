package com.uca.capas.domain;

public class Reserva {
	private Integer idReserva;
	private String fecha;
	private Integer aCantidad;
	private Double granTotal;
	private Double subTotal;
	private Double tCuenta;
	private Integer fkUsuario;
	private Integer fkFuncion;
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
	public Integer getFkUsuario() {
		return fkUsuario;
	}
	public void setFkUsuario(Integer fkUsuario) {
		this.fkUsuario = fkUsuario;
	}
	public Integer getFkFuncion() {
		return fkFuncion;
	}
	public void setFkFuncion(Integer fkFuncion) {
		this.fkFuncion = fkFuncion;
	}
	
	
}
