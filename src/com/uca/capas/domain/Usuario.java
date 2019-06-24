package com.uca.capas.domain;

import java.util.List;

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
@Table (schema="public",name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(generator="usuario_id_usuario_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="usuario_id_usuario_seq",sequenceName="public.usuario_id_usuario_seq",allocationSize = 1)
	
	@Column(name="id_usuario")
	private Integer idUsr;
	@Column(name="usuario")
	private String usuario;
	@Column(name="pass")
	private String pass;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="f_nacimiento")
	private String f_nacimiento;
	@Column(name="direccion")
	private String direccion;
	@Column(name="saldo")
	private Double saldo;
	@Column(name="estado")
	private Boolean estado;
	@Column(name="tipo")
	private Boolean tipo;
	@Column(name="comentario")
	private String comentario;
	@Column(name="iniciado")
	private Boolean iniciado;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_pais")
	private Pais pais;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_departamento")
	private Departamento departamento;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_municipio")
	private Municipio municipio;
	
	@OneToMany(mappedBy="usuario",cascade = 
		{ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, 
				CascadeType.REMOVE},fetch=FetchType.EAGER)
	private List<Reserva> reserva;
	
	
	public Integer getIdUsr() {
		return idUsr;
	}
	public void setIdUsr(Integer id) {
		this.idUsr = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getF_nacimiento() {
		return f_nacimiento;
	}
	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Boolean getTipo() {
		return tipo;
	}
	public void setTipo(Boolean tipo) {
		this.tipo = tipo;
	}
	public Boolean getIniciado() {
		return iniciado;
	}
	public void setIniciado(Boolean iniciado) {
		this.iniciado = iniciado;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
}
