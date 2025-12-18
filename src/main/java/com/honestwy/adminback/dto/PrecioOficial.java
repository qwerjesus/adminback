package com.honestwy.adminback.dto;

import com.google.cloud.firestore.annotation.PropertyName;

public class PrecioOficial {

	private String id;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String subcategoria;
	private String unidad;
	private String moneda;
	@PropertyName("precio_maximo")
	private Integer precioMaximo;
	@PropertyName("precio_referencia")
	private Integer precioReferencia;

	private Boolean activo;
	private String fuente;
	@PropertyName("fecha_creacion")
	private String fechaCreacion;
	private String foto;

	public PrecioOficial() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	@PropertyName("precio_maximo")
	public Integer getPrecioMaximo() {
		return precioMaximo;
	}

	@PropertyName("precio_maximo")
	public void setPrecioMaximo(Integer precioMaximo) {
		this.precioMaximo = precioMaximo;
	}

	@PropertyName("precio_referencia")
	public Integer getPrecioReferencia() {
		return precioReferencia;
	}

	@PropertyName("precio_referencia")
	public void setPrecioReferencia(Integer precioReferencia) {
		this.precioReferencia = precioReferencia;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	@PropertyName("fecha_creacion")
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	@PropertyName("fecha_creacion")
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public PrecioOficial(String id, String nombre, String descripcion, String categoria, String subcategoria,
			String unidad, String moneda, Integer precioMaximo, Integer precioReferencia, Boolean activo, String fuente,
			String fechaCreacion, String foto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.unidad = unidad;
		this.moneda = moneda;
		this.precioMaximo = precioMaximo;
		this.precioReferencia = precioReferencia;
		this.activo = activo;
		this.fuente = fuente;
		this.fechaCreacion = fechaCreacion;
		this.foto = foto;
	}

}
