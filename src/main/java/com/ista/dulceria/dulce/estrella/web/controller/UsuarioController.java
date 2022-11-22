package com.ista.dulceria.dulce.estrella.web.controller;

import com.ista.dulceria.dulce.estrella.web.models.entity.Usuario;
import com.ista.dulceria.dulce.estrella.web.models.entity.UsuarioRol;
import com.ista.dulceria.dulce.estrella.web.models.entity.service.RolServiceImpl;
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

    @Autowired
	private RolServiceImpl rolService;

    @PostMapping("/guardarUsuario")
    public ResponseEntity <Usuario> guardarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.guardarUsuario(usuario), HttpStatus.CREATED);
    }
    
    @PostMapping("/guardarUsuarioRol")
    public ResponseEntity <UsuarioRol> guardarUsuarioRol(@RequestBody UsuarioRol rolUsuario) {
        return new ResponseEntity<>(rolService.saveRolesUsuario(rolUsuario), HttpStatus.CREATED);
    }
    

    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }

}
