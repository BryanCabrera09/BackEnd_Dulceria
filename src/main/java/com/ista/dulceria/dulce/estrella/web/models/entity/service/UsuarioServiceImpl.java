package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import com.ista.dulceria.dulce.estrella.web.models.entity.Usuario;
import com.ista.dulceria.dulce.estrella.web.models.entity.UsuarioRol;
import com.ista.dulceria.dulce.estrella.web.models.entity.dao.RolRepository;
import com.ista.dulceria.dulce.estrella.web.models.entity.dao.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	
    @Autowired
    private UsuarioRepository usuarioRepository;

  
    @Override
    public void eliminarUsuario(Long id_usuario){
        usuarioRepository.deleteById(id_usuario);
    }


	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		Usuario usuarioLocal= usuarioRepository.findByUsername(usuario.getUsername());
        
        if(usuarioLocal!=null){
            System.out.println("El usuario ya existe");
        }else{
            usuarioLocal = usuarioRepository.save(usuario);

        }
        return usuarioLocal;
	}

	@Override
	public Usuario obtenerUsuario(String username) {
		// TODO Auto-generated method stub
		return usuarioRepository.findByUsername(username);
	}

}
