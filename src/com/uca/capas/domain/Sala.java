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
@Table (schema="public",name="sala")
public class Sala {
	
	@Id
	@GeneratedValue(generator="sala_id_sala_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="sala_id_sala_seq",sequenceName="public.sala_id_sala_seq",allocationSize = 1)
	@Column(name="id_sala")
	private Integer idSala;
	@Column(name="nsala")
	private String nsala;
	@Column(name="casientosn")
	private Integer cantAsientoN;
	@Column(name="casientoe")
	private Integer cantAsientoE;
	
	@OneToMany(mappedBy="sala",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<FunxSala> funxsala;
	
	
	public Integer getIdSala() {
		return idSala;
	}
	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}
	public String getNsala() {
		return nsala;
	}
	public void setNsala(String nsala) {
		this.nsala = nsala;
	}
	public Integer getCantAsientoN() {
		return cantAsientoN;
	}
	public void setCantAsientoN(Integer cantAsientoN) {
		this.cantAsientoN = cantAsientoN;
	}
	public Integer getCantAsientoE() {
		return cantAsientoE;
	}
	public void setCantAsientoE(Integer cantAsientoE) {
		this.cantAsientoE = cantAsientoE;
	}
	
	
}
