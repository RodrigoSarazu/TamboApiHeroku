package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.Productos;

@Repository
public interface ProductosInterface extends CrudRepository<Productos, Integer>{

}
