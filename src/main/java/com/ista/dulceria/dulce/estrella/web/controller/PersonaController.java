package com.ista.dulceria.dulce.estrella.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ista.dulceria.dulce.estrella.web.models.entity.Persona;
import com.ista.dulceria.dulce.estrella.web.models.entity.service.PersonaServiceImpl;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/persona")
public class PersonaController {
	
	@Autowired
	private PersonaServiceImpl personaService;
	
    @GetMapping("/listarPersonas")
    public ResponseEntity<List<Persona>> listarPersona(){
        return new ResponseEntity<>(personaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/guardarPersona")
    public ResponseEntity <Persona> crearPersona(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminarPersona/{id}")
    public ResponseEntity <?> eliminarcompra(@PathVariable long id) {
    	personaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/buscarPersonaId/{id}")
    public ResponseEntity <Persona> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(personaService.findById(id), HttpStatus.OK);
    }

}
