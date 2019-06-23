package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (schema="public",name="funxsala")
public class FunxSala {
	@Id
	@GeneratedValue(generator="funxsala_id_funxsala_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="funxsala_id_funxsala_seq",sequenceName="public.funxsala_id_funxsala_seq",allocationSize = 1)
	@Column(name="id_funxsala")
	private Integer idFunxSala;
	@Column(name="disp_especial")
	private Integer dispEspecial;
	@Column(name="disp_normal")
	private Integer dispNormal;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_funcion")
	private Funcion funcions;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_sala")
	private Sala sala;
	
	public Integer getIdFunxSala() {
		return idFunxSala;
	}
	public void setIdFunxSala(Integer idFunxSala) {
		this.idFunxSala = idFunxSala;
	}
	public Integer getDispEspecial() {
		return dispEspecial;
	}
	public void setDispEspecial(Integer dispEspecial) {
		this.dispEspecial = dispEspecial;
	}
	public Integer getDispNormal() {
		return dispNormal;
	}
	public void setDispNormal(Integer dispNormal) {
		this.dispNormal = dispNormal;
	}
	
	
}
