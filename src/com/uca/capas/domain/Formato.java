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
@Table (schema="public",name="formato")
public class Formato {
	@Id
	@GeneratedValue(generator="formato_id_formato_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="formato_id_formato_seq",sequenceName="public.formato_id_formato_seq",allocationSize = 1)
	@Column(name="id_formato")
	private Integer id_formato;
	@Column(name="formato")
	private String formato;
	
	@OneToMany(mappedBy="formato",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Funcion> funcion;
	
	public Integer getId_formato() {
		return id_formato;
	}
	public void setId_formato(Integer id_formato) {
		this.id_formato = id_formato;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
}

