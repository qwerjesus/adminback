package com.honestwy.adminback.dto;

public class Admin {

	private String id;
	private String email;
	private String password;
	private Boolean activo;
	private java.util.Date fechaCreacion;

	public Admin() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Admin(String id, String email, String password, Boolean activo, java.util.Date fechaCreacion) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}

}
