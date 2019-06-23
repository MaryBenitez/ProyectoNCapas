package com.uca.capas.domain;

public class Usuario {

	private Integer idUsuario;
	private String usuario;
	private String pass;
	private String nombre;
	private String apellido;
	private String f_nacimiento;
	private String direccion;
	private Double saldo;
	private Boolean estado;
	private Boolean tipo;
	private Integer fk_pais;
	private Integer fk_departamento;
	private Integer fk_municipio;
	private String comentario;
	private Boolean iniciado;
	
	public Integer getId() {
		return idUsuario;
	}
	public void setId(Integer id) {
		this.idUsuario = id;
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
	public Integer getFk_pais() {
		return fk_pais;
	}
	public void setFk_pais(Integer fk_pais) {
		this.fk_pais = fk_pais;
	}
	public Integer getFk_departamento() {
		return fk_departamento;
	}
	public void setFk_departamento(Integer fk_departamento) {
		this.fk_departamento = fk_departamento;
	}
	public Integer getFk_municipio() {
		return fk_municipio;
	}
	public void setFk_municipio(Integer fk_municipio) {
		this.fk_municipio = fk_municipio;
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
}
