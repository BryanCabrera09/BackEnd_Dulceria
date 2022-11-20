package com.ista.dulceria.dulce.estrella.web.controller;

import com.ista.dulceria.dulce.estrella.web.models.entity.Usuario;
import com.ista.dulceria.dulce.estrella.web.models.entity.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/guardarUsuario")
    public ResponseEntity <Usuario> guardarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.guardarUsuario(usuario), HttpStatus.CREATED);
    }
    


}
