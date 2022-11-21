package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import java.util.List;

import com.ista.dulceria.dulce.estrella.web.models.entity.Rol;
import com.ista.dulceria.dulce.estrella.web.models.entity.UsuarioRol;

public interface RolService {

	public Rol save(Rol rol);

    public List<Rol> findAll();

    public Rol findById(Long id);

    public void delete(Long id);
    
    // ROLES
    
    public UsuarioRol saveRolesUsuario(UsuarioRol userRol);
}
