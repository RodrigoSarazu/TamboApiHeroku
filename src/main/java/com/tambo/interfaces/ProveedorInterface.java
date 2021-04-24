package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.Proveedor;

@Repository
public interface ProveedorInterface extends CrudRepository<Proveedor, Integer>{

}
