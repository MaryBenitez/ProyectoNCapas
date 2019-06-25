package com.uca.capas.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table (schema="public",name="funcion")

public class Funcion {
	@Id
	@GeneratedValue(generator="funcion_id_funcion_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="funcion_id_funcion_seq",sequenceName="public.funcion_id_funcion_seq",allocationSize = 1)
	@Column(name="id_funcion")
	private Integer idFuncion;
	@Column(name="hora")
	private String hora;
	@Column(name="fecha")
	private String fecha;
	@Column(name="state")
	private Boolean activo;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_pelicula")
	private Pelicula pelicula;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_formato")
	private Formato formato;
	
	@OneToMany(mappedBy="funcions",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private Set<FunxSala> funxsala;
	
	@OneToMany(mappedBy="funcion",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private Set<Reserva> reserva;
	
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
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public String getActivoDelegate() {
		if(this.activo == null) return "";
		else {
			return activo == true ?"Activa":"Inactiva";
		}
	}
	
}
