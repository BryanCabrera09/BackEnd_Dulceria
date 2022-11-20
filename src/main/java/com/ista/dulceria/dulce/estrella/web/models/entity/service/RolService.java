package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import java.util.List;

import com.ista.dulceria.dulce.estrella.web.models.entity.Rol;

public interface RolService {

	public Rol save(Rol rol);

    public List<Rol> findAll();

    public Rol findById(Long id);

    public void delete(Long id);
}
