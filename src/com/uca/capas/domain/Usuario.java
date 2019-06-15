package com.uca.capas.domain;

public class Usuario {

	private int id;
	private String usuario;
	private String pass;
	private String nombre;
	private String apellido;
	private String f_nacimiento;
	private String direccion;
	private Double saldo;
	private Boolean estado;
	private Boolean tipo;
	private int fk_pais;
	private int fk_departamento;
	private int fk_municipio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getFk_pais() {
		return fk_pais;
	}
	public void setFk_pais(int fk_pais) {
		this.fk_pais = fk_pais;
	}
	public int getFk_departamento() {
		return fk_departamento;
	}
	public void setFk_departamento(int fk_departamento) {
		this.fk_departamento = fk_departamento;
	}
	public int getFk_municipio() {
		return fk_municipio;
	}
	public void setFk_municipio(int fk_municipio) {
		this.fk_municipio = fk_municipio;
	}
	
	
	
}
