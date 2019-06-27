package com.uca.capas.dto;

public class ReservationDTO {
	
	private Integer idUsuario;
	private Integer idFuncion;
	private String hora;
	private String fecha;
	private Integer idPelicula;
	private String nPelicula;
	private String formato;
	private Double saldo;
	private Integer asiento;
	public ReservationDTO(Integer idUsuario, Integer idFuncion, String hora, String fecha, Integer idPelicula, String nPelicula,
			String formato, Double saldo, Integer asiento) {
		super();
		this.idUsuario = idUsuario;
		this.idFuncion = idFuncion;
		this.hora = hora;
		this.fecha = fecha;
		this.idPelicula = idPelicula;
		this.nPelicula = nPelicula;
		this.formato = formato;
		this.saldo = saldo;
		this.asiento = asiento;
	
	}
	
	public ReservationDTO() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Integer getAsiento() {
		return asiento;
	}
	public void setAsiento(Integer asiento) {
		this.asiento = asiento;
	}
	
	
	
	
	
}
