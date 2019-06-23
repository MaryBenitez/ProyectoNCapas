package com.uca.capas.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (schema="public",name="municipio")
public class Municipio {
	@Id
	@GeneratedValue(generator="municipio_id_municipio_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="municipio_id_municipio_seq",sequenceName="public.municipio_id_municipio_seq",allocationSize = 1)
	@Column(name="id_municipio")
	private Integer idMuni;
	@Column(name="municipio")
	private String municipio;
	
	@OneToMany(mappedBy="municipio",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Usuario> usuario;
	
	public Integer getIdMuni() {
		return idMuni;
	}
	public void setIdMuni(Integer idMuni) {
		this.idMuni = idMuni;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	
}
