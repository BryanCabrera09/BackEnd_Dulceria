package com.ista.dulceria.dulce.estrella.web.controller;

import com.ista.dulceria.dulce.estrella.web.models.entity.Rol;
import com.ista.dulceria.dulce.estrella.web.models.entity.Usuario;
import com.ista.dulceria.dulce.estrella.web.models.entity.UsuarioRol;
import com.ista.dulceria.dulce.estrella.web.models.entity.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.HashSet;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario)throws Exception{
        Set<UsuarioRol> roles = new HashSet<>();

        Rol rol = new Rol();
        rol.setId_rol(2L);
        rol.setNombre_rol("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        return usuarioService.guardarUsuario(usuario, roles);

    }

}
