package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.DetalleCompras;

@Repository
public interface DetallecomprasInterface extends CrudRepository<DetalleCompras, Integer>{

}
