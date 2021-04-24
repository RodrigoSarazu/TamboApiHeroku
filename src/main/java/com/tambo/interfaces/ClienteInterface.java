package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.Cliente;

@Repository
public interface ClienteInterface extends CrudRepository<Cliente, Integer>{

}
