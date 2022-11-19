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
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Rol rol;
	
	
	

}
