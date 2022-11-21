package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ista.dulceria.dulce.estrella.web.models.entity.Persona;
import com.ista.dulceria.dulce.estrella.web.models.entity.dao.PersonaRepository;


@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	

    @Override
    public List<Persona> findAll() {
        // TODO Auto-generated method stub
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        // TODO Auto-generated method stub
        return personaRepository.save(persona);
    }


    @Override
    public Persona findById(Long id) {
        // TODO Auto-generated method stub
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
    	personaRepository.deleteById(id);

    }
	

}
