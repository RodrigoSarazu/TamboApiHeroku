package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.DetalleVentas;

@Repository
public interface DetalleventasInterface extends CrudRepository<DetalleVentas, Integer>{

}
