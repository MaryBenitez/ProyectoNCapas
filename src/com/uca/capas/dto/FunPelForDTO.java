package com.uca.capas.dto;

public class FunPelForDTO {
	
	private Integer idFuncion;
	private String hora;
	private String fecha;
	private String pelicula;
	private String formato;
	private Boolean activo;
	
	
	public FunPelForDTO() {
		super();
	}

	
	
	public FunPelForDTO(Integer idFuncion, String hora, String fecha, String pelicula, String formato, Boolean activo) {
		super();
		this.idFuncion = idFuncion;
		this.hora = hora;
		this.fecha = fecha;
		this.pelicula = pelicula;
		this.formato = formato;
		this.activo = activo;
		
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
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}



	public Boolean getActivo() {
		return activo;
	}



	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public String getActivoDelegate() {
		if(this.activo == null) return "";
		else {
			return (activo == true) ?"Activa":"Inactiva";
		}
	}
	
}
