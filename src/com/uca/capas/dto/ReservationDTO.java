package com.uca.capas.dto;

public class ReservationDTO {

	private Integer idFuncion;
	private String hora;
	private String fecha;
	private Integer idPelicula;
	private String nPelicula;
	private String formato;
	private long saldo;
	private Integer asientoD;
	private Integer asientoR;
	public ReservationDTO(Integer idFuncion, String hora, String fecha, Integer idPelicula, String nPelicula,
			String formato, long saldo, Integer asientoD, Integer asientoR) {
		super();
		this.idFuncion = idFuncion;
		this.hora = hora;
		this.fecha = fecha;
		this.idPelicula = idPelicula;
		this.nPelicula = nPelicula;
		this.formato = formato;
		this.saldo = saldo;
		this.asientoD = asientoD;
		this.asientoR = asientoR;
	}
	public Integer getIdFuncion() {
		return idFuncion;
	}
	public void setIdFuncion(Integer idFuncion) {
		this.idFuncion = idFuncion;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getnPelicula() {
		return nPelicula;
	}
	public void setnPelicula(String nPelicula) {
		this.nPelicula = nPelicula;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public long getSaldo() {
		return saldo;
	}
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	public Integer getAsientoD() {
		return asientoD;
	}
	public void setAsientoD(Integer asientoD) {
		this.asientoD = asientoD;
	}
	public Integer getAsientoR() {
		return asientoR;
	}
	public void setAsientoR(Integer asientoR) {
		this.asientoR = asientoR;
	}
	
	
	
	
}
