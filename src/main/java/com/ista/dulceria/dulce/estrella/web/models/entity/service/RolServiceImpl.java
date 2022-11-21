package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.dulceria.dulce.estrella.web.models.entity.Rol;
import com.ista.dulceria.dulce.estrella.web.models.entity.UsuarioRol;
import com.ista.dulceria.dulce.estrella.web.models.entity.dao.RolRepository;
import com.ista.dulceria.dulce.estrella.web.models.entity.dao.UsuarioRolRepository;


@Service
public class RolServiceImpl implements RolService {
	
	@Autowired
    private RolRepository rolRepository;
	
	@Autowired
    private UsuarioRolRepository userRolRepository;

    @Override
    public List<Rol> findAll() {
        // TODO Auto-generated method stub
        return (List<Rol>) rolRepository.findAll();
    }

    @Override
    public Rol save(Rol rol) {
        // TODO Auto-generated method stub
        return rolRepository.save(rol);
    }


    @Override
    public Rol findById(Long id) {
        // TODO Auto-generated method stub
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
    	rolRepository.deleteById(id);

    }

	@Override
	public UsuarioRol saveRolesUsuario(UsuarioRol userRol) {
		// TODO Auto-generated method stub
		return userRolRepository.save(userRol);
	}

}
