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
@Table (schema="public",name="departamento")
public class Departamento {
	@Id
	@GeneratedValue(generator="departamento_id_depart_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="departamento_id_depart_seq",sequenceName="public.departamento_id_depart_seq",allocationSize = 1)
	@Column(name="id_depart")
	private Integer idDept;
	@Column(name="departamento")
	private String departamento;
	
	@OneToMany(mappedBy="departamento",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Usuario> usuario;
	
	public Integer getIdDept() {
		return idDept;
	}
	public void setIdDept(Integer idDept) {
		this.idDept = idDept;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
