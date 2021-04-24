package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tambo.interfaces.VentasInterface;
import com.tambo.interfazservicio.VentasInterfazServicio;
import com.tambo.modelos.Ventas;

public class VentasServicio implements VentasInterfazServicio{
	
	@Autowired
	private VentasInterface data;

	@Override
	public List<Ventas> listar() {
		return (List<Ventas>)data.findAll();
	}

	@Override
	public Optional<Ventas> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(Ventas p) {
		int res = 0;
		Ventas ventas = data.save(p);
		if (!ventas.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int idven) {
		data.deleteById(idven);
	}

}
