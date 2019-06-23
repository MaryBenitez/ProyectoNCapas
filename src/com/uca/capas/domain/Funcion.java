package com.uca.capas.domain;

public class Funcion {
	
	private Integer idFuncion;
	private String hora;
	private String fecha;
	private Integer fk_pelicula;
	private Integer fk_formato;
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
	public Integer getFk_pelicula() {
		return fk_pelicula;
	}
	public void setFk_pelicula(Integer fk_pelicula) {
		this.fk_pelicula = fk_pelicula;
	}
	public Integer getFk_formato() {
		return fk_formato;
	}
	public void setFk_formato(Integer fk_formato) {
		this.fk_formato = fk_formato;
	}
	
	
}
