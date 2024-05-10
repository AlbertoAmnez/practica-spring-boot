package com.alberto.web.mvc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proyecto")

public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String fecha_inicio;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String fecha_fin;
	
	private boolean activo;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
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


	public String getFecha_inicio() {
		return fecha_inicio;
	}



	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}



	public String getFecha_fin() {
		return fecha_fin;
	}



	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}



	public Boolean getActivo() {
		return activo;
	}



	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
}
