package com.ista.dulceria.dulce.estrella.web.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "UsuarioRol")
public class UsuarioRol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario_rol;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario id_usuario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Rol rol;

	public Long getId_usuario_rol() {
		return id_usuario_rol;
	}

	public void setId_usuario_rol(Long id_usuario_rol) {
		this.id_usuario_rol = id_usuario_rol;
	}

	public Usuario getUsuario() {
		return id_usuario;
	}

	public void setUsuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
}
