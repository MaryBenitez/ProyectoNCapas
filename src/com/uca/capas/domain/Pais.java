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
@Table (schema="public",name="pais")
public class Pais {
	@Id
	@GeneratedValue(generator="pais_id_pais_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="pais_id_pais_seq",sequenceName="public.pais_id_pais_seq",allocationSize = 1)
	@Column(name="id_pais")
	private Integer idPais;
	@Column(name="npais")
	private String npais;
	
	@OneToMany(mappedBy="pais",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Usuario> usuario;
	
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getNpais() {
		return npais;
	}
	public void setNpais(String npais) {
		this.npais = npais;
	}
	
	
}
