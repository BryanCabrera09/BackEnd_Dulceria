package com.ista.dulceria.dulce.estrella.web.models.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_persona;
	
	private String cedula;
	private String nombres;
	private String apellidos;
	private String genero;
	private String correo;
	private String telefono;
	private String direccion;
	private Date fechaNacimiento;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "persona")
	private Set<Usuario> usuario = new HashSet<>();
	
	
	
	
	
	

}
