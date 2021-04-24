package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.Usuario;

@Repository
public interface UsuarioInterface extends CrudRepository<Usuario, Integer>{

}
