package com.ista.dulceria.dulce.estrella.web.models.entity.dao;

import com.ista.dulceria.dulce.estrella.web.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}
