package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.Compras;

@Repository
public interface ComprasInterface extends CrudRepository<Compras, Integer>{

}
