package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tambo.interfaces.DetalleventasInterface;
import com.tambo.interfazservicio.DetalleventasInterfazServicio;
import com.tambo.modelos.DetalleVentas;

public class DetalleventasServicio implements DetalleventasInterfazServicio{
	
	@Autowired
	private DetalleventasInterface data;

	@Override
	public List<DetalleVentas> listar() {
		return (List<DetalleVentas>)data.findAll();
	}

	@Override
	public Optional<DetalleVentas> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(DetalleVentas p) {
		int res = 0;
		DetalleVentas detalleventas = data.save(p);
		if (!detalleventas.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int iddv) {
		data.deleteById(iddv);
	}

}
