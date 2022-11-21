package com.ista.dulceria.dulce.estrella.web.models.entity.service;

import com.ista.dulceria.dulce.estrella.web.models.entity.Usuario;
import com.ista.dulceria.dulce.estrella.web.models.entity.UsuarioRol;
import com.ista.dulceria.dulce.estrella.web.models.entity.dao.RolRepository;
import com.ista.dulceria.dulce.estrella.web.models.entity.dao.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Esto es pa incriptar CONSTRASEÑAS
    
    private final PasswordEncoder passwordEncoder;
    
    public UsuarioServiceImpl (UsuarioRepository usuarioRepository) {
    	this.usuarioRepository = usuarioRepository;
    	this.passwordEncoder = new BCryptPasswordEncoder();
    }
    
    @Override
	public Usuario guardarUsuario(Usuario usuario) {
		Usuario usuarioLocal= usuarioRepository.findByUsername(usuario.getUsername());
        
        if(usuarioLocal!=null){
            System.out.println("El usuario ya existe");
        }else{
        	
        	String encoderPassword = this.passwordEncoder.encode(usuario.getContrasenia());
            usuario.setContrasenia(encoderPassword);
        	usuarioLocal = usuarioRepository.save(usuario);

        }
        return usuarioLocal;
	}
  
    @Override
    public void eliminarUsuario(Long id_usuario){
        usuarioRepository.deleteById(id_usuario);
    }


	

	@Override
	public Usuario obtenerUsuario(String username) {
		// TODO Auto-generated method stub
		return usuarioRepository.findByUsername(username);
	}

}
