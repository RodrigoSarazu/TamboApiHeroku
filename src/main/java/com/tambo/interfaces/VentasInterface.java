package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.Ventas;

@Repository
public interface VentasInterface extends CrudRepository<Ventas, Integer>{

}
