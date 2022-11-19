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

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> UsuarioRoles) throws Exception{

        Usuario usuarioLocal= usuarioRepository.findByUsername(usuario.getUsername());
        if(usuarioLocal!=null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario uya esta presente");
        }else{
            for (UsuarioRol usuarioRol: UsuarioRoles){
                    rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(UsuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);

        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username){
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long id_usuario){
        usuarioRepository.deleteById(id_usuario);
    }

}
