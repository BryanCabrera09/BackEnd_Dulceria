package com.ista.dulceria.dulce.estrella.web.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_categoria;
	
	public long getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}


	private String nombre_categoria;
	
	

	public Categoria() {
		super();
	}


	public Categoria(long id_categoria, String nombre_categoria) {
		super();
		this.id_categoria = id_categoria;
		this.nombre_categoria = nombre_categoria;
	}


	public String getNombre_categoria() {
		return nombre_categoria;
	}


	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	
	
	
	
}
