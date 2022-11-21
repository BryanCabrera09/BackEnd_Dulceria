package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import java.util.List;

import com.ista.dulceria.dulce.estrella.web.models.entity.Persona;


public interface PersonaService {
	
	public Persona save(Persona persona);

    public List<Persona> findAll();

    public Persona findById(Long id);

    public void delete(Long id);

}
