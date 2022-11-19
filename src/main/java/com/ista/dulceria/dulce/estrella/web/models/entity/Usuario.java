package com.ista.dulceria.dulce.estrella.web.models.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	private String cedula;
	private String nombres;
	private String username;
	private String contrasenia;
	private Boolean estado;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "usuario")
	private Set<UsuarioRol> usuarioRoles = new HashSet<>();
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Persona persona;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Empresa empresa;


}
