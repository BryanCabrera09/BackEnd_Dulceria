package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import com.ista.dulceria.dulce.estrella.web.models.entity.Usuario;
import com.ista.dulceria.dulce.estrella.web.models.entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario);
    
    public Usuario obtenerUsuario(String username);
    
    public void eliminarUsuario(Long id_usuario);
    
    

}
