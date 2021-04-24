package com.tambo.servicio;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.tambo.interfaces.ProductosInterface;
import com.tambo.interfazservicio.ProductosInterfazServicio;
import com.tambo.modelos.Productos;


public class ProductosServicio implements ProductosInterfazServicio{

	@Autowired
	private ProductosInterface data;
	
	@Override
	public List<Productos> listar() {
		return (List<Productos>)data.findAll();
	}

	@Override
	public Optional<Productos> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(Productos p) {
		int res = 0;
		Productos productos = data.save(p);
		if (!productos.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int idpro) {
		data.deleteById(idpro);
	}

}
