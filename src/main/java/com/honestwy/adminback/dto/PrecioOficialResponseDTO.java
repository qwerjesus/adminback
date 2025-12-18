package com.honestwy.adminback.dto;

public class PrecioOficialResponseDTO {

	private String id;
	private String nombre;
	private String categoria;
	private String subcategoria;
	private String unidad;
	private Integer precioMaximo;
	private Integer precioReferencia;
	private Boolean activo;
	private String descripcion;
	private String moneda;
	private String fuente;
	private String fechaCreacion;
	private String foto;

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

	public Integer getPrecioMaximo() {
		return precioMaximo;
	}

	public void setPrecioMaximo(Integer precioMaximo) {
		this.precioMaximo = precioMaximo;
	}

	public Integer getPrecioReferencia() {
		return precioReferencia;
	}

	public void setPrecioReferencia(Integer precioReferencia) {
		this.precioReferencia = precioReferencia;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public PrecioOficialResponseDTO(String id, String nombre, String categoria, String subcategoria, String unidad,
			Integer precioMaximo, Integer precioReferencia, Boolean activo, String foto, String descripcion,
			String moneda, String fuente, String fechaCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.unidad = unidad;
		this.precioMaximo = precioMaximo;
		this.precioReferencia = precioReferencia;
		this.activo = activo;
		this.foto = foto;
		this.descripcion = descripcion;
		this.moneda = moneda;
		this.fuente = fuente;
		this.fechaCreacion = fechaCreacion;
	}

	public PrecioOficialResponseDTO() {
		super();
	}

}
