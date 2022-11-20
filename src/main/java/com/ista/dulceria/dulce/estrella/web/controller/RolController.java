package com.ista.dulceria.dulce.estrella.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.dulceria.dulce.estrella.web.models.entity.Rol;
import com.ista.dulceria.dulce.estrella.web.models.entity.service.RolServiceImpl;
;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/rol")
public class RolController {

	@Autowired
	private RolServiceImpl rolService;
	
    @GetMapping("/listarRoles")
    public ResponseEntity<List<Rol>> listarRol(){
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/guardarRoles")
    public ResponseEntity <Rol> crearRol(@RequestBody Rol rol) {
        return new ResponseEntity<>(rolService.save(rol), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminarRoles/{id}")
    public ResponseEntity <?> eliminarRol(@PathVariable long id) {
    	rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/buscarRolesId/{id}")
    public ResponseEntity <Rol> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(rolService.findById(id), HttpStatus.OK);
    }
}
